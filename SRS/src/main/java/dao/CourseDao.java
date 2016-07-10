package dao;

import java.util.HashMap;

import model.Course;


public interface CourseDao {
	
	 Course getCourse(Course whatErinLikes);
	 Course addCourse(Course whatErinLikes) ;
	 Course deleteCourse(Course whatErinLikes);
	 Course modifyCourse(Course whatErinLikes);
	HashMap<String, Course> findAll();

}
