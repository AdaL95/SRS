package daoImpl.sqlite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ProfessorDao;
import model.Course;
import model.Professor;
import util.DBUtil;

public class professorDaoImpl implements ProfessorDao{
	@Override
	public List<Professor> getProfessor(Professor whatErinLikes) throws Exception{
		List<Professor> professors=new ArrayList<Professor>();
		String sql="Select * from professor where name=?";
		Connection conn=DBUtil.getSqliteConnection();
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, whatErinLikes.getName());
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
		
			Professor professor=new Professor();
			professor.setSsn(rs.getString("ssn"));
			professor.setName(rs.getString("name"));
			professor.setTitle(rs.getString("title"));
			professor.setDepartment(rs.getString("department"));
			professors.add(professor);
		    
		}
		return professors;
	}

	@Override
	public Professor addProfessor(Professor whatErinLikes){
		Professor professor=null;
		String sql ="Insert Into professor(ssn,name,title,department) Values(?,?,?,?)";
		try {
			Connection conn=DBUtil.getSqliteConnection();
			PreparedStatement stmt= conn.prepareStatement(sql);
			stmt.setString(1, whatErinLikes.getSsn());
			stmt.setString(2, whatErinLikes.getName());
			stmt.setString(3, whatErinLikes.getTitle());
			stmt.setString(4, whatErinLikes.getDepartment());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return professor;
	}
		
	@Override
	public Professor deleteProfessor(Professor whatErinLikes){
		Professor professor=null;
		Connection connection = DBUtil.getSqliteConnection();
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("Delete from professor where ssn =?");
			stmt.setString(1, whatErinLikes.getSsn());
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return professor;
	}
	
	@Override
	public Professor modifyProfessor(Professor whatErinLikes){
		
		Professor professor=null;
		Connection conn=DBUtil.getSqliteConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement("Update [professor] Set name=?,title=?,department=? where ssn=?");
			
			stmt.setString(1, whatErinLikes.getName());
			stmt.setString(2,  whatErinLikes.getTitle());
			stmt.setString(3,  whatErinLikes.getDepartment());
			stmt.setString(4,  whatErinLikes.getSsn());
			stmt.executeUpdate();
			//ResultSet result = stmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return professor;
		
		
	}
}
