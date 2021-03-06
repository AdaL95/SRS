package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfessorDao;
import daoImpl.sqlite.professorDaoImpl;
import model.Professor;

/**
 * Servlet implementation class searchProfessor
 */
@WebServlet("/searchProfessor")
public class searchProfessor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchProfessor() {
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
		String name=request.getParameter("name");
		Professor whatErinLikes = new Professor( name,"", "", "");
		ProfessorDao professorDao=new professorDaoImpl();
		List<Professor> professor=null;
		try{
	    	professor =professorDao.getProfessor(whatErinLikes);
			
	    }catch(Exception e){
	    	//TODO Auto-generated catch block 
	    	e.printStackTrace();
	    }
		request.setAttribute("getprofessor", professor);
		request.getRequestDispatcher("/pages/reProfessor.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
