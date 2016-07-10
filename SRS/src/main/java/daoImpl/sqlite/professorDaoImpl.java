package daoImpl.sqlite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		String sql ="Insert Into course(courseNo,courseName,credits) Values(?,?,?)";
	}
}
