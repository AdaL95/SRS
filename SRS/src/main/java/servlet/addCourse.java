package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CourseDao;
import dao.UserDao;
import daoImpl.sqlite.courseDaoImpl;
import daoImpl.sqlite.userDaoImpl;
import model.Course;
import model.Student;

/**
 * Servlet implementation class addCourse
 */
@WebServlet("/addCourse")
public class addCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addCourse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		String  courseNo=request.getParameter("courseNo");
		String  courseName=request.getParameter("courseName");
		String  credits=request.getParameter("credits");
		Course whatErinLikes = new Course(courseNo,courseName, Double.valueOf(credits));
		 CourseDao courseDAO=new courseDaoImpl();
		 Course course=null;
		    try{
		    	course =courseDAO.addCourse(whatErinLikes);
		    }catch(Exception e){
		    	//TODO Auto-generated catch block 
		    	e.printStackTrace();
		    }
		    request.getRequestDispatcher("/pages/success.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
