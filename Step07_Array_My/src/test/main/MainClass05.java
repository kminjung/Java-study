package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		// double type 을 담을 수 있는 배열 객체를 생성해서
		// 10.1, 10.2, 10.3 을 순서대로 담아 보세요
		
		//방법 1
		double[] doub= {10.1, 10.2, 10.3 }; // 참조데이터 타입
		
		//방법 2
		double[] nums=new double[3]; // 참조데이터 타입
		nums[0]=10.1;
		nums[1]=10.2;
		nums[2]=10.3;
	}
}
