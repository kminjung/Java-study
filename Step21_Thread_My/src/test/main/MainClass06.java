package test.main;

import test.mypac.MyRunnable;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작됨");
		//Runnable 인터페이스를 구현한 클래스로 객체 생성
		
		//한 줄의 코드로 간단히 시작 시키려면
		new Thread(new MyRunnable()).start();
		//(new MyRunnable())전달되는 것은 Runnable type 의 참조 값
		
		System.out.println("main 스레드 종료됨");
	}
}
