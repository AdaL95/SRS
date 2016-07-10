package daoImpl.sqlite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.TranscriptDao;
import model.TranscriptEntry;
import util.DBUtil;

public class transcriptDaoImpl implements TranscriptDao{

	@Override
	public List<TranscriptEntry> getTranscript(TranscriptEntry whatErinLikes) throws Exception{
		List<TranscriptEntry> transcriptentries = new ArrayList<TranscriptEntry>();
		String sql="Select * from transcript where ssn=?";
		Connection conn=DBUtil.getSqliteConnection();
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, whatErinLikes.getStudent().getSsn());
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			TranscriptEntry transcriptentry=new TranscriptEntry();
			transcriptentry.setGrade(rs.getString("grade"));
			transcriptentry.setStudent(whatErinLikes.getStudent());
			transcriptentry.setSection(whatErinLikes.getSection());
			transcriptentry.setCourseName(rs.getString("courseName"));
			transcriptentries.add(transcriptentry);
		}
		
		return transcriptentries;
	}


	@Override
	public List<TranscriptEntry> getSelected(TranscriptEntry whatErinLikes) throws Exception{
		List<TranscriptEntry> transcriptentries = new ArrayList<TranscriptEntry>();
		String sql="Select * from transcript where courseName=?";
		Connection conn=DBUtil.getSqliteConnection();
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, whatErinLikes.getCourseName());
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			TranscriptEntry transcriptentry=new TranscriptEntry();
			transcriptentry.getStudent().setSsn(rs.getString("ssn"));
			transcriptentry.getStudent().setName(rs.getString("name"));
			transcriptentries.add(transcriptentry);
		}
		
		return transcriptentries;
	}
}
