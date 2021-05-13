package step9_03.student;

import java.util.Map;

public class StudentSelectAll {
	
	private StudentDAO studentDAO;
	
	public StudentSelectAll(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	
	public Map<String , StudentVO> allSelect(){
		return studentDAO.getStudentDB();
	}
	
	
	public void printAll() {
		
		Map<String , StudentVO> map = studentDAO.getStudentDB(); // Hashmap 변수 map에 stDB값 대입
		
		for (String key : map.keySet()) { // Hashmap 의 모든 key 얻어오기
			map.get(key).printOneInfo();
		}
		
	}
	
}
