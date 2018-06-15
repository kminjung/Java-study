package test.main;

import test.mypac.WeaPon;

public class MainClass03 {
	public static void main(String[] args) {
		// 토끼를 공격하고 싶다면?
		WeaPon w1=new WeaPon() {// extends WeaPon 을 한 익명의 class 

			@Override
			public void attack() {
				System.out.println("토끼를 공격해요");
				
			}
		};
		useWeapon(w1);
		
		useWeapon(new WeaPon() {

			@Override
			public void attack() {
				System.out.println("누군가를 공격해요");
				
			}
			
		});
	}
	
	public static void useWeapon(WeaPon w) {
		w.prepare();
		w.attack();
	}
}
