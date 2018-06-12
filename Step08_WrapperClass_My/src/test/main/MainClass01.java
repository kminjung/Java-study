package test.main;
/*
 * [ 기존 data type 의 참조 data type ]
 * 
 * - 때로는 기본 data type 을 참조 data type 에 포장(wrap)
 *   해서 사용해야 할 때가 있다.
 * - 그럴 때 사용하는 클래스가 Wrapper class 이다.
 * 
 *  byte    : Byte
 *  short   : Short
 *  int     : Interger
 *  long    : Long
 *  
 *  float   : Float
 *  double  : Double
 *  
 *  boolean : Boolean
 *  
 *  char    : Character
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//기본 data type 변수 num1
		int num1=10; //바로 10이 있다
		//참조 data type 변수 num2
		Integer num2=20; // 정수를 대입해 주면 자동 포장 된다. type 만 다를 뿐 /
		//저장소에 키 값이 있고 사물함에 20이 있다.
		
		//자유롭게 산술연산 가능
		int result=num1+num2;
		int result2=num1*num2;
		Integer result3=num2/num1;
		
		System.out.println("result:"+result);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
	}
}
