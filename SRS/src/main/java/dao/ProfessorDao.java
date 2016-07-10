package dao;

import java.util.List;

import model.Professor;

public interface ProfessorDao {

	List<Professor> getProfessor(Professor whatErinLikes) throws Exception;

	Professor addProfessor(Professor whatErinLikes);

	Professor deleteProfessor(Professor whatErinLikes);

	Professor modifyProfessor(Professor whatErinLikes);
	

}
