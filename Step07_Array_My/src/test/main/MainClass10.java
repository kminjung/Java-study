package test.main;

public class MainClass10 {
	public static void main(String[] args) {
		//java 의 기본 반복문
		for(int i=0; i<10; i++) { //int 타입 i에다 0을 넣은 것 / for 문 안에서만 사용 가능
			System.out.println("i:"+i);
		}
		int[] nums= {10,20,30,40,50};
		
		for(int i=0; i<nums.length; i++) { // 총 5번 반복
			int tmp=nums[i];
			System.out.println("tmp:"+tmp);
		}
	}
}
