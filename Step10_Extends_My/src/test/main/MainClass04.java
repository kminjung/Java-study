package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 참조값을 SmartPhone type 변수에 담기
		SmartPhone sPhone=new SmartPhone();
		//이미 생성된 객체의 참조값은 부모 type 변수에 다시 담을 수 있다.
		
		//아이디 값이 다 똑같다.but 타입(사용설명서)은 다르다.
		//자식타입(sPhone)에 있는 변수는 얼마든지 부모타입(Object) 변수에 들어갈 수 있다.
		Object p1=sPhone;
		Phone p2=sPhone;
		HandPhone p3=sPhone;
	}
}
