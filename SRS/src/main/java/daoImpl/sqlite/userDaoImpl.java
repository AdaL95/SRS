package daoImpl.sqlite;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.UserDao;
import model.Student;
import model.User;
import util.DBUtil;

public class userDaoImpl implements UserDao{
	
	public boolean loginIn1(Student a){
		Connection connection = DBUtil.getSqliteConnection();
		Statement stmt;
		boolean i=false;
		try {
			stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery("Select * From student where ssn=? and password=? ");
	 
			while(result.next()){
				String db_ssn = result.getString("ssn");
				String db_pwd = result.getString("password");
				if(a.getName().equals(db_ssn)&& a.getSsn().equals(db_pwd ) ){
					
					i=true;
				}
				else {
					
				}
				
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		return i;
		}
	
	
	public boolean loginIn2(User a){
	Connection connection = DBUtil.getSqliteConnection();
	Statement stmt;
	boolean i=false;
	try {
		stmt = connection.createStatement();
		ResultSet result = stmt.executeQuery("Select * From admin where ssn=? and password=? ");
 
		while(result.next()){
			String db_ssn = result.getString("ssn");
			String db_pwd = result.getString("password");
			if(a.getSsn().equals(db_ssn)&& a.getPassword().equals(db_pwd ) ){
				
				i=true;
			}
			
		}
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
}
	return i;
	}

}
