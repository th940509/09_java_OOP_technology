package step9_03.student;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();	
			
		while (true) {
			
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
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
				//   StudentVO id, num, name -> private id, num, name
				//   stIn
				
			}
			else if (selectMenu == 2) {
				/*
				 *  # 구현해 보시오.
				 *  
				 *  - 아이디를 입력받아서 해당되는 아이디가 있으면
				 *    이름과 번호를 변경할 수 있는 기능
				 * 
				 * */
			}
			else if (selectMenu == 3) {
				/*
				 *  # 구현해 보시오.
				 *  
				 *  - 아이디를 입력받아서 해당되는 아이디가 있으면 삭제
				 * 
				 * */
			}
			else if (selectMenu == 4) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);
				
				if (st != null) st.printOneInfo();
			
			}
			else if (selectMenu == 5) {
				
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