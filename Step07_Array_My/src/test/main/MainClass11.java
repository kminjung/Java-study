package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		//1. String type 을 담을 수 있는 방5개짜리 배열객체를 생성
		String[] names=new String[5];
		//2. 5개의 방에 각각 다른 문자열 저장하기
		names[0]="강민정";
		names[1]="김미진";
		names[2]="밀크";
		names[3]="다리";
		names[4]="몽이";
		//3. 반복문 for 를 이용해서 5개의 방에 있는 문자열을 순서대로 콘솔창에 출력하기
		for(int i=0; i<names.length; i++) {
			String tmp=names[i];
			System.out.println(tmp);
			
		}
	}
}
