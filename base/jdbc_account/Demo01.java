package Jdbc_connection;

import java.sql.SQLException;

import org.junit.Test;

public class Demo01 {
	private Account_Dao dao = new Account_Dao();
	public void serviceMethod() {
		try {
			jdbcUtils.BeginTransaction();
			dao.update("zhangsan", -1000);
			dao.update("lisi", 1000);
			jdbcUtils.commitTransaction();
		}catch(Exception e) {
			try {
				jdbcUtils.rollbackTransaction();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
