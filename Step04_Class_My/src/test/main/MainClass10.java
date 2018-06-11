package test.main;

import java.util.Random;
import test.mypac.AttackUnit;
import java.util.Scanner;

public class MainClass10 { //지역변수 6개를 만들었다.
	public static void main(String[] args) {
		//기본 data type
		int num=10;
		boolean isRun=true;
		char ch='A';
		
		// 참조 data type
		Random ran=new Random(); // 필요한 객체를 만들어서 . 찍어서 사용하면 된다.
		String name="김구라";
		AttackUnit unit=new AttackUnit();
		Scanner scan=new Scanner(System.in);
		
		
	}
}
/*기본데이터와 참조데이터의 가장 큰 차이는?
 * - 기본데이터 타입에는 실제로 그 값이 들어있음, 아무런 기능이 없음
 * - 참조데이터에는 객체의 id 값이 들어있음
 */
