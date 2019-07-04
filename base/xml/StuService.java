package xml_service;
import cn.itcast.vo.Student;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class StuService {
    public static void addStu(Student student) throws DocumentException, IOException {
        //1.创建解析器

        //2.得到document

        //3.获取根节点

        //4.在根节点上创建stu标签

        //5.在stu标签上依次添加id name age

        //6.在id name age 上面依次添加值

        //7.回写xml

        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src/student.xml");
        Element root = document.getRootElement();
        Element stu = root.addElement("stu");
        Element id1 = stu.addElement("id");
        Element name1 = stu.addElement("name");
        Element age1 = stu.addElement("age");
        id1.setText(student.getId());
        name1.setText(student.getName());
        age1.setText(student.getAge());

        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/student.xml"),format);
        xmlWriter.write(document);
        xmlWriter.close();
    }

    //删除 根据学生id删除
    public static void delStu(String id) throws DocumentException, IOException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src/student.xml");

        //获取所有id
        List<Node> list = document.selectNodes("//id");
        for(Node node : list){
            String idv = node.getText();
            if(idv.equals(id)){
                Element stu = node.getParent();
                Element student = stu.getParent();
                student.remove(stu);
            }
        }
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/student.xml"),format);
        xmlWriter.write(document);
        xmlWriter.close();
    }

    public static Student getStu(String id) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src/student.xml");

        List<Node> list = document.selectNodes("//id");
        Student student = new Student();
        for(Node node : list){
            String idv = node.getText();
            if(idv.equals(id)){
                Element stu = node.getParent();
                String namev = stu.element("name").getText();
                String agev = stu.element("age").getText();
                student.setName(namev);
                student.setId(idv);
                student.setAge(agev);
            }
        }
        return student;
    }
}
