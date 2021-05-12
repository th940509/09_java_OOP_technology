package step9_03.student;

import java.util.Map;

public class StudentDAO {
	
	public void insert(StudentVO st) { // studentVO 클래스변수 대입
		StudentRepository.getStDB().put(st.getId(), st);
	} //           stDB.put(studentVO.getId(), studentVO);
	  // stDB HashMap에 put(  입력한 id(key) ,   value  );
	  // id(key), Main클래서에서 입력한 id, num, name 저장
	
	public StudentVO select(String id) {
		return StudentRepository.getStDB().get(id);
		// return 값 -> stDB.get(id)  :  HashMap(stDB) id(key)에 할당된 value를 얻어온다.
		// value => StudentVO 반환
	}
	
	public Map<String , StudentVO> getStudentDB(){
		return StudentRepository.getStDB(); // HashMap변수 반환
	}
	

}
