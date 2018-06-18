package test.main;//제어문

import java.util.Scanner;

public class MainClass10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열 입력(종료:q) :");
			String msg=scan.nextLine();
			if(msg.equals("q")) {//특정 조건에서
				//반복문 탈출
				break;
			}
			System.out.println("입력한 문자열:"+msg);
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
