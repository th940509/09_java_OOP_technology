package step9_03.student;

import java.util.HashMap;

public class StudentRepository {

	private static HashMap<String, StudentVO> stDB = new HashMap<String , StudentVO>();
	// HashMap<String, StudentV0> stDB = new HashMap<String, StudentVO>();
	//           key      value
	

	public static HashMap<String, StudentVO> getStDB() {
		return stDB;
	}

	public static void setStDB(HashMap<String, StudentVO> stDB) {
		StudentRepository.stDB = stDB;
	}	
	
}