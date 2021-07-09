package step9_03.student;
import java.util.Scanner;

//*분석, 코드작성 2021/05/12 15:00 ~ 18:00 // 05/13 14:00 ~ 14:30 
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();	
			
		while (true) {
			
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) { // 추가
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next(); // asdf
				
				System.out.print("번호를 입력하세요 : ");
				int num = scan.nextInt(); // 1234
				
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next(); // 소영
				
				StudentInsert stInsert = controller.getInsert();
				//   stInsert 클래스 변수에 getInsert()메서드에서 반환되는
				//   insert 값 대입
				//   StudentInsert stInsert = insert;
				//   insert -> new StudentInsert (stDAO)
				//   StudentInsert stInsert = new StudentInsert (stDAO);
				
				stInsert.insert(new StudentVO(id , num , name));
				//   StudentVO id, num, name -> privte id, num, name
				
			}
			else if (selectMenu == 2) { // 수정    2021/05/12 16:50 ~ 17:24
				/*
				 *  # 구현해 보시오.
				 *  
				 *  - 아이디를 입력받아서 해당되는 아이디가 있으면
				 *    이름과 번호를 변경할 수 있는 기능
				 * 
				 * */
			System.out.println("ID를 입력하세요: ");
			String id2 = scan.next();
			
			StudentInsert stInsert = controller.getInsert();
			
				if (stInsert.checkId(id2)) {
					System.out.println( "ID를 확인하세요. ");
				}
				else {
					
					StudentRepository.getStDB().remove(id2);
					
					System.out.println("[메세지] 변경할 번호를 입력하세요: ");
					int num2 = scan.nextInt();
					
					System.out.println("[메세지] 변경할 이름을 입력하세요: ");
					String name2 = scan.next();
					
					stInsert.insert(new StudentVO(id2 , num2 , name2));
					
				}
			}
			
			else if (selectMenu == 3) { // 삭제    2021/05/12 17:24 ~ 17:35
				/*
				 *  # 구현해 보시오.
				 *  
				 *  - 아이디를 입력받아서 해당되는 아이디가 있으면 삭제
				 * 
				 * */
			System.out.println("ID를 입력하세요: ");
			String deleteId = scan.next();
				
			StudentInsert stInsert = controller.getInsert();
				
				if (stInsert.checkId(deleteId)) {
					System.out.println( "ID를 확인하세요. ");
				}
				else {
					StudentRepository.getStDB().remove(deleteId);
				}
				
			}
			else if (selectMenu == 4) { // 출력
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				// stSelect = new StudentSelect(stDAO);
				
				StudentVO st = stSelect.select(id);
				
				if (st != null) st.printOneInfo(); // StudentVO의 클래스 변수 st가 null이 아닐경우
				// printOneInfo 출력 매서드로 이동
			
			}
			else if (selectMenu == 5) { // 전체 출력
				
				StudentSelectAll stAll = controller.getSelectAll();
				stAll.printAll();
			
			}
			else if (selectMenu == 6) {
				
				System.out.println("종료");
				scan.close();
				break;
			
			}
			
		}
		
	}

}
