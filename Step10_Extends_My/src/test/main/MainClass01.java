package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass01 {
	public static void main(String[] args) {
		//Phone p=new Phone();//폰의 생성자 호출
		//object 클래스에 정의된 기능이 나온다.
		//p.
		
		//Phone 클래스를 상속받은 HandPhone 클래스의 생성자를 호출해서
		//객체를 생성한 후 참조값을 HandPhone type 변수에 담는다.
		HandPhone p=new HandPhone(); //앞에 정의된 타입은 p 안에 들어있는 것에 대한 사용 설명서 역할을 한다.
		//Phone 클래스에 정의된 기능
		p.call();
		//HandPhone 클래스에 정의된 기능
		p.mobileCall();
		p.takePicture();
		//p.을 하면 Phone 에 있는 object 와 HandPhone 에 있는 object 가 나온다.
		
		
		
	}
}
