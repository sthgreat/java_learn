package jdbc_sql;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class Demo01 {
	public void zhuanzhang(String from, String to, double money) throws SQLException, IOException {
		//建立连接
		Connection con = null;
		try {
			con = jdbcUtils.getConnection();
			//开启事务
			con.setAutoCommit(false);
			
			AccountDao dao = new AccountDao();
			dao.updateBalance(con, from, -money);
			dao.updateBalance(con, to, money);
			
			
			//...提交事务
			con.commit();
			con.close();
		}catch(Exception e) {
			con.rollback();
			con.close();
		}
	}
	
	@Test
	public void fun1() throws SQLException, IOException {
		zhuanzhang("zhangsan","lisi",100);
	}
}
