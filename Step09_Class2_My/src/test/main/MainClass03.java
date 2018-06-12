package test.main;
// [ 생성자 다중정의 ]
import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  new Car() 는 Car 클래스의 생성자(constructor)* 를 호출하는 표현식이다.
		 */
		Car c1=new Car(); // 참조값을 변수에 담고 싶으면
		Car c2=new Car("소나타");
		Car c3=new Car("프라이드");//String 타입을 생성하면서 전달한 것
		
		// 생성된 3개 객체의 메소드 각각 호출하기
		c1.drive();
		c2.drive();
		c3.drive();
	}
}
