package test.main;

import java.util.Random;//자바를 설치하면 기본적으로 사용할 수 있는 클래스

public class MainClass08 {
	public static void main(String[] args) {
		//Random 객체 생성해서 참조값 변수에 담기
		Random ran=new Random();//클래스 명이 곧 타입 
		//Random 객체의 nextInt() 메소드를 이용해서 int 범위 내에서 무작위 정수를 얻어낸다.
		int result=ran.nextInt();
		System.out.println("result:"+result); // result 에 있는 값이 출력된다.
		//System 은 class 이고 system 에는 out 이 있고 println 이라는 기능이 있다.
	}

}
//어떤 객체(메소드)의 도움을 받아서 원하는 것을 표현하는 프로그래밍을 많이 할 것
