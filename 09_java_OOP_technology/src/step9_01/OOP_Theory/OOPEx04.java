package step9_01.OOP_Theory;

/*
 * 
 * 	# this : 자신의 객체
 *  # super : 부모클래스의 객체
 *  
 *  # this() : 자신의 생성자
 *  # super() : 부모클래스의 생성자
 *  
 *  # this.testMethod() : 자신의 메서드 호출
 *  # testMethod()		: 자신의 메서드 호출
 *  
 *  # super.testMethod() : 부모의 메서드 호출
 * 
 * */

class Parent {
	String name;
	int age;
	
	Parent(){
		this("무명", 0); // 현재 클래스의 Parent(String name, int age) 생성자 호출
		System.out.println("부모 클래스의 기본 생성자 실행");
	}
	
	Parent(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("부모 클래스의 추가된 생성자 실행");
	}
	
	void testMethod() {
		System.out.println("부모 클래스의 테스트 메서드");
	}
	
}

class Child extends Parent { // 안의 생성자를 적지 않아도 부모 생성자가 실행됨. (super()가 생략되어 있음)

	Child(){
		super(); // 부모클래스의 기본 생성자를 실행 (기본적으로 생략되어 있음) 
		//super("앨런튜링" , 70); // 부모클래스의 추가된 생성자 실행
		System.out.println("자녀 클래스의 기본 생성자 실행");
	}
	
	Child(String name, int age) {
		
		//this(); 
		//super();
		//super("앨런튜링", 50);
		this.name = name;
		this.age = age;
		System.out.println("자녀 클래스의 추가된 생성자 실행");
	}
	
	void testMethod() {
		System.out.println("자녀 클래스의 테스트 메서드");
	}
	
	void testMethod1() {
		super.testMethod(); // 부모 클래스의 testMethod 호출
	}
	
	void testMethod2() {
		this.testMethod(); // 자신의 testMethod 호출
	}
	
	void testMethod3() {
		testMethod(); // 자신의 testMethod 호출 (this 생략가능)
	}
}

public class OOPEx04 {

	public static void main(String[] args) {
		
		new Parent(); // = Parent aa = new Parent();
		System.out.println("=================================");
		
		new Parent("제임스 고슬링", 70); 
		System.out.println("=================================");

		new Child(); 
		System.out.println("=================================");
		// 부모 생성자 실행 -> Parent()안의 this(무명,0) 실행 -> Parent(String name, int age)실행, "부모 클래스의 추가된 생성자 실행" 출력 ->
		// Parent()로 이동 -> "부모 클래스의 기본 생성자 실행" 출력 -> Child() 이동 -> "자녀 클래스의 기본 생성자 실행" 출력
		
		new Child("제임스 고슬링 주니어", 70);
		System.out.println("=================================");
		//부모 생성자 실행-> Parent()안의 this(무명,0) 실행 -> Parent(String name, int age)실행, "부모 클래스의 추가된 생성자 실행" 출력 -> 
		//Parent()로 이동 -> "부모 클래스의 기본 생성자 실행" 출력 -> Child(String name, int age) 으로 이동 -> "자녀 클래스의 추가된 생성자 실행" 출력
	
		
		Child child = new Child();
		
		System.out.println("=================================");
		
		child.testMethod();
		child.testMethod1();
		child.testMethod2();
		child.testMethod3();
	}

}
