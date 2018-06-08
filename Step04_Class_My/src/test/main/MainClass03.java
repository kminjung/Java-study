package test.main;

import test.mypac.AttackUnit;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * AttackUni 클래스를 이용해서 객체를 생성하고
		 * 참조값(id) 값에 . 찍어서 attack() 메소드 호출하기 - new class name() (객체 생성방법)
		 */
		
		AttackUnit unit=new AttackUnit(); // AttackUnit class 를 생성하면 type 은 AttackUnit 이다.
										  // class 명이 type 이 되는 것.
		unit.attack();
		unit.attack();
		unit.attack();
		
		// AttackUnit 클래스로 새로운 객체를 생성해서 attack() 메소드를 3번 호출해 보세요.
		
		AttackUnit unit2=new AttackUnit();
		unit2.attack();
		unit2.attack();
		unit2.attack();

	}

}
