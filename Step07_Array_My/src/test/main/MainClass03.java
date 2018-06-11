package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//String type 을 담을 수 있는 방5개 짜리 배열 객체를 생성해서
		//참조값을 변수에 담기
		//5개의 방에는 null 이 들어 있다.
		String[] names=new String[5];//배열 안에 공간이 5개 만들어졌음. 참조값이 안담겨있음
		// 0 번방에 String type 대입
		names[0]="김구라";
		// 1번방에String Type 대입
		names[1]="해골";
		// 2번방에 String Type 대입
		names[2]="원숭이";
		
		//방의 크기 참조
		int size=names.length; // 5
		
	}
}
