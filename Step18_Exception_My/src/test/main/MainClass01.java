package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 *   [ Exception 처리 문법 ]
 *   
 *   try{
 *       Exception 이 발생할 가능성이 있는 코드 블럭
 *       .
 *       .
 *   }catch(Exception type 변수명){
 *       Exception 이 발생했을때 실행할 코드 블럭 
 *   }catch(Exception type2 변수명{
 *   	코드 블럭
 *   }...
 */
public class MainClass01 {
	public static void main(String[] args) {
		//키보드로 부터 입력 받을 Scanner 객체
		Scanner scan=new Scanner(System.in);//입력 구문
		try {
			System.out.print("나눌수 입력:");
			int num1=scan.nextInt();
			System.out.print("나누어 지는수 입력:");
			int num2=scan.nextInt();
			//num2 를 num1 으로 나눈 몫
			int mog=num2/num1;
			//num2 를 num1 으로 나눈 나머지
			int na=num2%num1;
			
			System.out.println(num2+" 를 "+num1+" 으로 나눈 결과");
			System.out.println("몫:"+mog+" 나머지:"+na);
		}catch(ArithmeticException ae) {
			System.out.println("어떤수를 0으로 나눌수는 없어요");
			ae.printStackTrace(); // 예외의 메세지를 출력하고 싶을 때
		}catch(InputMismatchException ime) {
			System.out.println("숫자 형식으로 입력해 주세요");
			ime.printStackTrace();
		}
		
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
//Scanner 클래스는 표준 Java 클래스 라이브러리에 속하며, 다양한 타입의 입력 값들을 읽어들이기 위한 편리한 방법을 제공한다
/*
 * 출력 구문은 System.out 으로 시작 하지만
 * 입력 구문은 System.in 으로 시작합니다.
 */

