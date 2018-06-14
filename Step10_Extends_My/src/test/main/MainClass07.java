package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass07 {
	public static void main(String[] args) {
		Phone p1=new Phone();
		HandPhone p2=new HandPhone();
		SmartPhone p3=new SmartPhone();
		
		// 메소들 호출하면서 변수에 담긴 참조값 전달.
		MainClass07.usePhone(p1);
		MainClass07.usePhone(p2);
		MainClass07.usePhone(p3);
		
		//메소드 호출하면서 객체를 생성해서 참조값 전달 Phone p=new Phone() 와같다.
		MainClass07.usePhone(new Phone());
		MainClass07.usePhone(new HandPhone());
		MainClass07.usePhone(new SmartPhone());
		// NullPointerException 발생 
		MainClass07.usePhone(null);//빈 값 전달
		
	}
	
	public static void usePhone(Phone p) {//자식타입은 얼마든지 부모타입에 들어간다.
		p.call();
	}
}
