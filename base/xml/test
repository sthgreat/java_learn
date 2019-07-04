package cn.itcast.vo;

import org.dom4j.DocumentException;
import xml_service.StuService;

import java.io.IOException;

public class test {
    public static  void main(String[] args) throws IOException, DocumentException {
        testDel();
    }

    public static void testAdd() throws IOException, DocumentException {
        Student stu = new Student();
        stu.setAge("20");
        stu.setId("11");
        stu.setName("wangwu");
        StuService.addStu(stu);
    }

    public static void testDel() throws IOException, DocumentException {
        StuService.delStu("100");
    }

}
