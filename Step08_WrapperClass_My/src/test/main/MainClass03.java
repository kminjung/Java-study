package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// 문자 "100"을 정수 100으로 바꾸기
		int result=Integer.parseInt("100");//숫자 형태로 되어 있는 문자열을 실제 숫자로 바꿔준다.
		// 숫자 999를 문자 "999" 로 바꾸기
		String result2=Integer.toString(999);
		
		double result3=Double.parseDouble("10.1");
		String result4=Double.toString(10.2); // 실수를 문자형태로 바꿀 때
		
	}
}
