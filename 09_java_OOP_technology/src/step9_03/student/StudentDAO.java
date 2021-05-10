package step9_03.student;

import java.util.Map;

public class StudentDAO {
	
	public void insert(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	public StudentVO select(String id) {
		return StudentRepository.getStDB().get(id);
		// stDB값 반환 -> get(id) -> SutdnetVO에 
		// 저장되어 있는 id 반환
	}
	
	public Map<String , StudentVO> getStudentDB(){
		return StudentRepository.getStDB();
	}

}
