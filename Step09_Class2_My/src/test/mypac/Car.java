package test.mypac;

public class Car {
	//(순서) 1. 필드 정의
	public String name;
	
	//2. 생성자
	//생성자는 return type 이 없고 클래스명과 동일하다.
	public Car() {
		System.out.println("Car() 생성자 호출됨");
	}
	//인자로 String type 을 전달받는 생성자
	public Car(String name) {
		//생성자의 인자로 전달되는 값을 필드에 저장하기
		this.name=name;
		System.out.println("Car(String name) 생성자 호출됨");
	}
	
	//3. 메소드
	public void drive() {
		System.out.println(this.name+" 이(가) 달려요!");
	}
}
//클래스 안에 정의할 수 있는 것 - 생성자  new 라는 예약어를 이용해서 호출할 수 있다.
//클래스는 생성자가 모양만 다르면 여러개 생성될 수 있다.
