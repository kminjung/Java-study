package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		int count=0;
		while(true) {
			System.out.println("수행됨!");
			count++;
			if(count==10) {
				break;//반복문 탈출
			}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
//몇번 반복할 지 모르는 상황에서 사용한다.while 문을
