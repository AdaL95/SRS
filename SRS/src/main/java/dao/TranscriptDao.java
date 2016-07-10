package dao;

import java.util.List;

import model.TranscriptEntry;

public interface TranscriptDao {

	List<TranscriptEntry> getTranscript(TranscriptEntry whatErinLikes) throws Exception;

	List<TranscriptEntry> getSelected(TranscriptEntry whatErinLikes) throws Exception;
}
