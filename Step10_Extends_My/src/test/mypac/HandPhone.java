package test.mypac;
/*
 *  [ 상속(Extends) ]
 *  
 *  - 클래스를 정의하면서 특정 클래스를 상속 받으려면
 *    extends 예약어를 이용해서 상속 받을 수 있다.
 *    
 *    extends 상속 받을 클래스명
 */

public class HandPhone extends Phone{
	/*
	 * object 를 상속받지 않고 다른 클래스를 상속 받기
	 * 같은 클래스 안에 있기 때문에 import 안해도 된다.
	 */
	
	//이동중에 전화를 거는 메소드
	public void mobileCall() {
		System.out.println("이동중에 전화를 걸어요");
	}
	//사진찍는 메소드
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어요");
	}

}
