package test.mypac;

public class Bakery {//클래스 안에 클래스를 정의 할 수 있다.
	//Bread 라는 내부 클래스(Inner class)
	public class Bread{
		public void eat() {
			System.out.println("빵을 먹어요");
		}
	}
	//Cake 라는 내부 클래스
	public class Cake{
		public void eat() {
			System.out.println("케이크를 먹어요");
		}
	}
	//Bread 객체를 리턴해 주는 메소드
	public Bread GetBread() {

		return new Bread();
	}
	// Cake 객체를 리턴해 주는 메소드
	public Cake getCake() {
		return new Cake();
	}
}
