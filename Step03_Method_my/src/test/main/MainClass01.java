package test.main;

public class MainClass01 { //클래스 식별자
	public static void main(String[] args) {//메소드의 이름은 main 이다.
		
		// main 메소드 run 했을 때 실행된다.
		System.out.println("main 메소드가 시작되었습니다.");
		
		/*
		 *  static 예약어가 붙은 메소드를 호출하는 방법 / class 에다 . 을 붙여야 함 공유의 의미
		 *  
		 *  클래스명.메소드명(); 클래스에다. 하면 동작이 나온다.
		 *  
		 *  ex)
		 *  MainClass01.a(); MainClass01.하면 a 동작이 나온다.
		 */		
		MainClass01.a();
		/*
		 * 동일한 클래스 안에 존재하는 static 메소드를 호출할 때는 클래스명. 생략 가능하다.
		 */
		b();
		
		System.out.println("main 메소드가 종료(returdfn) 됩니다.");
	}
	
	// a 메소드
	public static void a(){
		System.out.println("a 메소드가 시작 되었습니다.");
		
		System.out.println("a 메소드가 종료(return) 됩니다.");
	}
	
	// b 메소드
	public static void b() {
		System.out.println("b 메소드가 시작 되었습니다.");
		
		System.out.println("b 메소드가 종료(return) 됩니다.");
	}
}
