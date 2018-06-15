package test.main;

import test.mypac.OurWeapon;
import test.mypac.WeaPon;

public class MainClass02 {
	public static void main(String[] args) {
		WeaPon w1=new OurWeapon(); // Weapon 속성의 OurWeapon 객체를 생성
		useWeapon(w1);
	}
	public static void useWeapon(WeaPon w) {
		w.prepare();
		w.attack();
		//useWeapon class 를 생성해서 ()안에 WeaPon 을 부르고 w 로 지정했다.
		//그래서 w 로 object 를 사용할 수 있다.
	}
}
