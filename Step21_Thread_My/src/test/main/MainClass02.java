package test.main;

import test.mypac.SubWorker;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 스레드가 시작 됨");
		
		// 새로운 작업단위 시작 시키기
		new SubWorker().start(); //run() 해보고 Run 통해서 차이점 확인해보기
		
		System.out.println("main 스레드가 종료 됨");
	}
}
