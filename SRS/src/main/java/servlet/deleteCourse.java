package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CourseDao;
import daoImpl.sqlite.courseDaoImpl;
import model.Course;

/**
 * Servlet implementation class deleteCourse
 */
@WebServlet("/deleteCourse")
public class deleteCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteCourse() {
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
		Course whatErinLikes = new Course(courseNo,"", 0);
		CourseDao courseDao=new courseDaoImpl();
		Course course=null;
		 try{
		    	course =courseDao.deleteCourse(whatErinLikes);
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
