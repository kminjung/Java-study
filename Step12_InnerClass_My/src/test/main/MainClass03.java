package test.main;

public class MainClass03 {
	// ↑클래스 안에 정의한 클래스는 Inner Class 라고 한다.
	class Gura{
		
	}
	public static void main(String[] args) {
		/*
		 * 메소드 안에 클래스를 정의할 수도 있다.
		 * 
		 * Local Inner Class 라고 한다.
		 */
		class Car{
			//메소드
			public void drive() {
				System.out.println("달려요");
			}
		}
		// 객체 생성 후
		Car car=new Car();
		// 메소드 호출 가능
		car.drive();
	}
}
