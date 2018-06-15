package test.main;

import test.mypac.MyWeapon;
import test.mypac.WeaPon;

public class MainClass01 {
	public static void main(String[] args) {
		//추상 클래스를 상속받은 자식 클래스로 객체 생성
		MyWeapon w1=new MyWeapon();
		//메소드 사용해 보기
		w1.prepare();
		w1.attack();
		
		//추상 클래스 type 으로 받을 수도 있다.
		WeaPon w2=new MyWeapon();
		w2.prepare();
		w2.attack();
	}
}
