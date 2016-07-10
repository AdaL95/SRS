package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CourseDao;
import dao.ProfessorDao;
import daoImpl.sqlite.courseDaoImpl;
import daoImpl.sqlite.professorDaoImpl;
import model.Course;
import model.Professor;

/**
 * Servlet implementation class addProfessor
 */
@WebServlet("/addProfessor")
public class addProfessor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addProfessor() {
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
		String  ssn=request.getParameter("ssn");
		String  name=request.getParameter("name");
		String  title=request.getParameter("title");
		String  department=request.getParameter("department");
		Professor whatErinLikes = new Professor(ssn,name, title,department);
		 ProfessorDao professorDAO=new professorDaoImpl();
		 Professor professor=null;
		    try{
		    	professor =professorDAO.addProfessor(whatErinLikes);
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
