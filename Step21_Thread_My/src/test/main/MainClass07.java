package test.main;

public class MainClass07 {
	public static void main(String[] args) {
		//익명의 innerClass 를 이용해서 Runnable type 참조값 얻어내기
		
		//Runnable run1=new Runnable() {};//익명의 클래스
		Runnable run1=new Runnable() {
			@Override
			public void run() {
				System.out.println("새로운 작업단위임");
			}
		};
		new Thread().start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("새로운 작업단위2!!");
			}}).start(); // {} 은 익명의 inner class
	}
}
