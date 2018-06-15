package test.main; // 확장 for 문 쓸 일이 많다.

public class MainClass04 {
	public static void main(String[] args) {
		int[] nums= {10, 20, 30, 40, 50};
		
		for(int i=0; i<nums.length; i++) {
			//int 배열의 i번째 방 참조
			int tmp=nums[i];
			System.out.println("tmp:"+tmp);
		}
		System.out.println("-- 확장 for문 --");
		// 위의 것을 줄여서 쓴 것
		for(int tmp:nums) {
			System.out.println("tmp:"+tmp);
		}
	}
}
