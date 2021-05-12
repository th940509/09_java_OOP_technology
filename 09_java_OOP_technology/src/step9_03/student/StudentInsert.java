package step9_03.student;
public class StudentInsert {
	
	private StudentDAO studentDAO;
	
	public StudentInsert(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}	
	
	public void insert(StudentVO studentVO) {
		String id = studentVO.getId(); // Private id -> getId메서도로 id 값 가져오기
		if (checkId(id)) { // checkId메서드에 id 대입
			studentDAO.insert(studentVO);
		}
		else {
			System.out.println("중복아이디 입니다");
		}
	}
	
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		// StudentVo studentVO = 반환된 StudentVO 대입
		return studentVO == null? true:false;
		// studentVO가 null이면 true
		// null이 아니면 false
	}
	
}
