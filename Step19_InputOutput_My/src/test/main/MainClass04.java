package test.main;

import java.io.IOException;
import java.io.OutputStream;

public class MainClass04 {
	public static void main(String[] args) {
		//PrintStream 객체의 참조값을 부모 type 인 OutputStream
		// type으로 받아서 테스트 하기
		OutputStream os=System.out;
		//os.write(97); 인셉션 발생했을 때 마우스 대고 클릭
		try {
			//출력 할 준비
			os.write(97); //97 에 해당하는 수는 a 다.
			os.write(98);
			os.write(99);
			os.write(100);
			os.write(101);
			//출력 준비가 된 문자열 출력하기
			os.flush();//방출 
			
			//방 5개짜리 byte[] 객체를 생성해 보세요
			byte[] nums=new byte[5];
			nums[0]=102;
			nums[1]=103;
			nums[2]=104;
			nums[3]=105;
			nums[4]=106;
			//.wrote() 메소드 호출하면서 byte[배열] 객체 전달 ,  배열 째로 전달한 것
			os.write(nums); // auto flush 
			System.out.println();
			
			// .write(byte[] , 시작인덱스, 갯수)
			os.write(nums, 0, 3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
