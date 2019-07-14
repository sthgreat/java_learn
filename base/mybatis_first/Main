package cn.dzkjdx.mybatis;

import org.apache.ibatis.session.SqlSession;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        Logger log = Logger.getLogger(String.valueOf(Main.class));
        SqlSession sqlSession = null;
        try{
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
//            Role role = roleMapper.getRole(1);
//            System.out.println(role.toString());
            Role role = new Role();
            role.setId(3);
            role.setNote("nihao");
            role.setRoleName("ik");
            roleMapper.insertRole(role);
//            roleMapper.deleteRole(2);
            sqlSession.commit(); //事务需要提交
        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }


    }
}
