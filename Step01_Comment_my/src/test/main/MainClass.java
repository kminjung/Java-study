// 한줄 주석입니다.

/*
 *  /* + enter 여러줄 주석입니다.
 *  하나
 *  두울
 */

// 빨간색으로 표시되는 단어는 예약어다.
// 예약어는 식별자로 쓸 수 없다.
package test.main;// package 예약어를 이용해서 패키지 표시

//클래스 식별자(이름) 은 MainClass 입니다.
//public(전체공개) class (class 명)
public class MainClass {
	// run 했을 때 실행순서가 들어오는 main 메소드 정의하기
	public static void main(String[] args) {
				// 식별자 : main - 메소드명  / args - 변수명
		System.out.println("main 메소드가 시작됨");
		System.out.println("하나");
		System.out.println("두울");
		System.out.println("세엣");
		
		System.out.println("main 메소드가 종료됨");
	}//메소드의 끝
}//클래스의 끝