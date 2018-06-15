package test.main;
/* class 안에 정의할 수 있는 것
 * fild(정보), method(기능), static fild(객체를 생성하지 않아도 정보가 있는 것)
 * static method(static 을 붙이지 않아도 기능이 있는 것), constructor()
 * 
 * class 안에 class를 정의할 수 있다(내부클래스)
 * 내부 클래스에 한해서 static class 를 사용할 수 있다.
 */

public class MainClass01 {
	//필드
	public int num=10;//객체를 생성했을 때 num 이라는 저장소가 만들어 지고 초기값은 10이다.
	//static 필드
	public static int num2=20;//static 이 붙으면 클래스당 1개의 저장소가 만들어진다.
	
	// static main 메소드
	public static void main(String[] args) {
		//여기서의 static 은 MainClass01 . 을 눌렀을 때 기능이 나오게 한다.
		//run 을 눌렀을 때 실행순서는 여기서부터
		
		// static 메소드 안에서는 static 자원들만 참조 가능
		//int result=this.num;
		
		//참조 가능
		int result2=MainClass01.num2;
		
		//내부 클래스로 객체 생성 가능
		Gura g=new Gura();
	}
	//내부 클래스 정의하기
	public static class Gura{
		
	}
}
