package step9_03.student;

import java.util.HashMap;

public class StudentRepository {

	private static HashMap<String, StudentVO> stDB = new HashMap<String , StudentVO>();
	// HashMap<String, StudentV0> stDB = new HashMap<String, StudentVO>();
	//           key      value
	

	public static HashMap<String, StudentVO> getStDB() {
		return stDB;
	}
	// private 변수(HashMap)을 외부로 꺼내주는 메서드
	
	public static void setStDB(HashMap<String, StudentVO> stDB) {
		StudentRepository.stDB = stDB;
	}	
	// private 변수(HashMap)을 외부에서 수정하는 메서드
	
}
