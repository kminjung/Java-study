package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		// int type 을 담을 수 있는 방 5개짜리 배열 객체를 생성해서
		// 참조값을 변수에 담기
		// 각각의 방에는 0이 들어있다.
		int[] nums=new int[5];
		
		// 0 번방 참조해서 값 대입하기
		nums[0]=10;
		// 1 번방 참조해서 값 대입하기
		nums[1]=20;
		// 2 번방 참조해서 값 대입하기
		nums[2]=30;
		
		// 방의 크기 참조하기
		int size=nums.length;
	}
}
