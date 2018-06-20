package test.main;
/*
 *  [ Tread ]
 *  
 *  - 작업단위
 *  - main() 메소드에서 시작되는 작업단위 : 메인 스레드
 *  - 실행의 흐름이라고도 한다.
 *  - 필요하다면 여러개의 작업단위를 만들 수 있다.
 *  - 작업을 효율적으로 처리하기 위하여서 사용한다.m
 *  - 독립적으로 가긴 하지만 동시에 처리되지는 않는다.m
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 스레드가 시작 됨");
		test();
		//메인스레드를 5초동안 지연시키기
		//Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 스레드가 종료 됩니다.");
	}
	
	public static void test() {
		System.out.println("test() 메소드에 실행순서가 왔습니다.");
	}
}
