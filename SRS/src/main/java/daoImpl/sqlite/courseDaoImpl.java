package daoImpl.sqlite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import dao.CourseDao;
import model.Course;
import util.DBUtil;


public class courseDaoImpl implements CourseDao{
	@Override
	public Course getCourse(Course whatErinLikes){
		Course course=null;
		String sql = "select * from course where courseNo=?";
		try {
			Connection conn=DBUtil.getSqliteConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, whatErinLikes.getCourseNo());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
		
			 course=new Course(rs.getString("courseNo"), rs.getString("courseName"), rs.getDouble("credits"));
										
					}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return course;
	}
	@Override
	public Course addCourse(Course whatErinLikes){
		Course course=null;
		String sql ="Insert Into course(courseNo,courseName,credits) Values(?,?,?)";
		try {
			Connection conn=DBUtil.getSqliteConnection();
			PreparedStatement stmt= conn.prepareStatement(sql);
			stmt.setString(1, whatErinLikes.getCourseNo());
			stmt.setString(2,  whatErinLikes.getCourseName());
			stmt.setDouble(3,  whatErinLikes.getCredits());
			stmt.executeUpdate();
			//ResultSet result = stmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return course;
	}

	/*@Override
	public Course addCourse() {
		// TODO Auto-generated method stub
		return null;
	}*/
	@Override
	public Course deleteCourse(Course whatErinLikes){
		Course course=null;
		Connection connection = DBUtil.getSqliteConnection();
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("Delete from gourse where courseNo =?");
			stmt.setString(1, whatErinLikes.getCourseNo());
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
		return course;
	}

	public Course modifyCourse(Course whatErinLikes){
		
		Course course=null;
		Connection conn=DBUtil.getSqliteConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement("Update [course] Set courseName=?,credits=? where courseNo=?");
			
			stmt.setString(1, whatErinLikes.getCourseName());
			stmt.setDouble(2,  whatErinLikes.getCredits());
			stmt.setString(3,  whatErinLikes.getCourseNo());
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
		return course;
		
		
	}
	@Override
	public HashMap<String, Course> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/*@Override
	public Course deleteCourse(Course whatErinLikes) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
}

