package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * System.in 은 키보드로부터 입력 받을 수 있는
		 * InputStream type 이 참조값이 들어 있는 필드이다.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력:");
		// Scanner 객체의 nextLine() 메소드를 이용해서 문자열 입력 받기
		String str=scan.nextLine();
		
		System.out.println("입력 받은 문자열:"+str);
	}
}
