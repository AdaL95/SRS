package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.TranscriptDao;
import daoImpl.sqlite.courseDaoImpl;
import daoImpl.sqlite.transcriptDaoImpl;
import model.Course;
import model.Section;
import model.Student;
import model.Transcript;
import model.TranscriptEntry;

/**
 * Servlet implementation class searchGrade
 */
@WebServlet("/searchGrade")
public class searchGrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchGrade() {
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
		Student student=new Student("", ssn, "", "", "");
		Section section=new Section(0, "", "", null, "", 0);
		TranscriptEntry whatErinLikes = new TranscriptEntry(student, ssn, section);
		TranscriptDao transcriptDao=new transcriptDaoImpl();
		List<TranscriptEntry> transcriptentry=null;
		 try{
		    	transcriptentry =transcriptDao.getTranscript(whatErinLikes);
		    }catch(Exception e){
		    	//TODO Auto-generated catch block 
		    	e.printStackTrace();
		    }
		 request.setAttribute("trans", transcriptentry);
		 request.getRequestDispatcher("/pages/reGrade.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
