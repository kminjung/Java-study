package test.main;
/*
 *  [ 연산자 ]
 *  
 *  6. 3항 연산자
 *  
 *  - 형식
 *  
 *  boolean type data ? 값1 : 값2
 */

public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=true;
		
		String result = isWait ? "기다려" : "기다리지마";
		// isWait 가 true 면 result 에 "기다려" 가 들어가고
		// false 면 "기다리지마"; 가 들어간다.
		
		// 3항 연산을 is~else 문으로 대처하면
		String result2=null; // 빈 변수를 만든 것 
		if(isWait) {
			result2="기다려";
		}else {
			result2="기다리지마";
		}
		//if 문을 간단히 사용하고 싶을 때 3항 연산자를 사용한다.
		
	}
}
