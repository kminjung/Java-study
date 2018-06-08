package test.main;

public class MainClass05 {
	public static void main(String[] args) { // 뭔가를 () 하면서 전달하는 방법을 알아야 함
		int num1=10;
		double num2=10.1;
		char ch='A';
		boolean isWait=false;
		String myName="밀크";
		// a 메소드 호출
		MainClass05.a(999); // 값을 만들어서 전달하느냐
		MainClass05.a(num1); // 변수명을 전달하느냐
		// b 메소드 호출
		MainClass05.b(false);
		MainClass05.b(isWait);
		// c 메소드 호출
		MainClass05.c("Mlik");
		MainClass05.c(myName);
	}
	public static void a(int num) {
		
	}
	public static void b(boolean isWait) {
		
	}
	public static void c(String msg) {
		
	}
}
