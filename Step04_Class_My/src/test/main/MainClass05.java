package test.main;

import test.mypac.AttackUnit;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  AttackUnit 클래스로 객체를 3개 생성해서 (new 가 3번 생성되어야 함)
		 *  참조값을 각각 다른 지역변수에 담고
		 *  attack() 메소드를 한번식 호출해 보세요
		 */
		AttackUnit unit1=new AttackUnit(); // 메소드 안에서 선언된 변수는 지역변수
		AttackUnit unit2=new AttackUnit(); // 변수명을 잘 짓고 타입을 잘 적었느냐
		AttackUnit unit3=new AttackUnit();
		
		unit1.attack();
		unit2.attack();
		unit3.attack();
	}
}
