package test.main;

import java.util.Random;

public class MainClass09 {
	public static void main(String[] args) {
		Random ran=new Random();
		//()안에 랜덤하는 수의 범위를 정한다. 0 이상 10 미만의 랜덤한 정수 얻어내기
		int result=ran.nextInt(5);
		System.out.println("result:"+result);
		
	}
}
