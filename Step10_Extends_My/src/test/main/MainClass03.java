package test.main;

import test.mypac.SmartPhone;
import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 *  [ 다형성(Polymorphism) ]
 *  
 *  - java 에서 객체의 참조값은 다형성을 가질 수 있다.
 *  - 다형성이란 여러가지 type 이 될 수 있다는 의미이다. (id 는 다양한 type 을 가질 수 있다.)
 *    객체를 변수에 담을 때 여러가지를 담을 수 있다는 뜻
 *    ex) 강민정은 - 인간 타입,여자타입,안경을 쓴 타입,머리가 긴 타입 등등
 */

public class MainClass03 {
	//SmartPhone 객체의 참조값을 부모 type 변수에 대입하기
	public static void main(String[] args) {
		// p1 에 . 을 찍으면 object 에 정의된 기능만 사용 가능
		Object p1=new SmartPhone();//SmartPhone 이지만 사용설명서가 Object 이다.
		
		// p2 에 . 을 찍으면 object, Phone 에 정의된 기능만 사용 가능
		Phone p2=new SmartPhone();
		
		// p3. 에 . 을 찍으면 object, Phone, HandPhone 에 정의된 기능만 사용 가능
		HandPhone p3=new SmartPhone();
		
		//SmartPhone 객체의 참조값을 SmartPhone type 변수에 대입하기
		// p4 에 . 찍으면 object,Phone, HandPhone, SmartPhone 에 정의된 모든 기능 사용 가능
		SmartPhone p4=new SmartPhone();
		
		//p1.  p2.  p3.  p4. 해서 어떤 기능을 쓸 수 있는지 확인하기
		
	}
}
