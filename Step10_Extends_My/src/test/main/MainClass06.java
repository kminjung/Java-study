package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//HandPhone 객체 생성해서 HandPhone type 변수에 대입
		HandPhone hPhone=new HandPhone();
		
		// 실행시에 Exception 발생!
		// 원래 객체의 기능이 있는 것을 casting 해야 한다.
		SmartPhone p1=(SmartPhone)hPhone;
		p1.doInternet();
	}
}
