package cn.dzkjdx.spring_mybatis;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");

//        SqlSessionTemplate sqlSessionTemplate = ctx.getBean(SqlSessionTemplate.class);
//        sqlSessionTemplate.delete("cn.dzkjdx.spring_mybatis.RoleMapper.deleteRole", 3);
        RoleMapper roleMapper = ctx.getBean(RoleMapper.class);
        Role role = roleMapper.getRole(1);
        System.out.println(role);
    }
}
