package Jdbc_connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class jdbcUtils {
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	private static Connection con = null; //事务专用连接
	
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	public static Connection getConnection() throws SQLException {
		if(con!=null) {
			return con;//已经开启了begintransaction
		}
		return dataSource.getConnection();
	}
	
	public static void BeginTransaction() throws SQLException {
		/*
		 * 开启事务
		 */
		if(con!=null) throw new SQLException("事务已经开始，请勿重复开启");
		con = getConnection();
		con.setAutoCommit(false);
	}
	
	public static void commitTransaction() throws SQLException {
		if(con==null) throw new SQLException("事务并未开启，不能提交");
		con.commit();
		con.close();
		con=null; //事务结束，杀掉连接
	}
	
	public static void rollbackTransaction() throws SQLException {
		if(con==null) throw new SQLException("事务并未开启，不能回滚");
		con.rollback();
		con.close();
		con=null; //事务结束，杀掉连接
	}
}
