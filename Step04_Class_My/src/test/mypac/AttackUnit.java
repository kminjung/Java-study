package test.mypac;

public class AttackUnit { // Heap 영역에 객체를 만들 수 있다.
	//non static 멤버필드 / static 을 안붙이면 설계도와 같다. / static 을 붙이면 그 자체로 쓸 수 있다.
	//but static 이 없으면 객체의 설계도이기 때문에 객체를 만들어야 사용할 수 있다. - new 클래스명();
	public int energy=100;
	
	//non static 멤버 메소드
	//공격하는 메소드
	public void attack() {
		System.out.println("공격해요!");
	}
	//방어하는 메소드
	public void defence() {
		System.out.println("방어해요!");
	}
	//움직이는 기능
	public void move() {
		System.out.println("움직여요!");
	}
}
