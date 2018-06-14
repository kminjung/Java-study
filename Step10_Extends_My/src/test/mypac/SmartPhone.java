package test.mypac;

public class SmartPhone extends HandPhone {
	
	//인터넷을 하는 메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	//takePicture() 메소드 재정의(오버라이드) 하기
	//똑같은 모양으로 정의하면 된다.덮어쓰기 처럼
	@Override // 상징적인 의미 - 부모메소드를 제정의한다. (커서를 둔 후 ctrl + space bar)
	public void takePicture() {
		System.out.println("1000 만 화소의 사진을 찍어요");
		
	}
}
