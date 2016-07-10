package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TranscriptDao;
import daoImpl.sqlite.transcriptDaoImpl;
import model.Section;
import model.Student;
import model.TranscriptEntry;

/**
 * Servlet implementation class selected
 */
@WebServlet("/selected")
public class selected extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selected() {
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
		String courseName=request.getParameter("courseName");
		Student student=new Student("", "", "", "", "");
		Section section=new Section(0, "", "", null, "", 0);
		TranscriptEntry whatErinLikes = new TranscriptEntry(student, courseName, section);
		TranscriptDao transcriptDao=new transcriptDaoImpl();
		List<TranscriptEntry> transcriptentry=null;
		 try{
		    	transcriptentry =transcriptDao.getSelected(whatErinLikes);
		    }catch(Exception e){
		    	//TODO Auto-generated catch block 
		    	e.printStackTrace();
		    }
		 request.setAttribute("selected", transcriptentry);
		 request.getRequestDispatcher("/pages/reSelected.jsp").forward(request,response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
