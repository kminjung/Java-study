package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//SmartPhone type 객체를 생성해서 Object type 변수에 담기
		//자식 객체를 부모 타입으로 받기
		Object p1=new SmartPhone();
		
		//부모타입은 자식타입에 그냥 들어가지 않는다.
		//Phone 으로 casting 해서 대입
		//p1 만 보면 object type 이지만 casting 을 하면 p1 이 Phone 타입이 맞다는 것으로 강제지정
		Phone p2=(Phone)p1;
		//HandPhone 으로 casting 해서 대입
		HandPhone p3=(HandPhone)p1;
		//SmartPhone 으로 casting 해서 대입
		SmartPhone p4=(SmartPhone)p1;
	}
}
