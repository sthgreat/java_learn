package Jdbc_connection;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class Account_Dao {
	public static void update(String name, double money) throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "update account set balance = balance+? where name =?";
		Object[] params = {money,name};
		Connection con = jdbcUtils.getConnection();
		qr.update(con, sql, params);
	}
}
