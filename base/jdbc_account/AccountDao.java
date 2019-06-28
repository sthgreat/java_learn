package jdbc_sql;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AccountDao {//修改余额
	public void updateBalance(Connection con, String name,double balance) {
		try {
			String sql = "update account set balance=balance+? where name=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setDouble(1, balance);
			pst.setString(2, name);
			
			pst.executeUpdate();
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
