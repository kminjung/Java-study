package test.mypac;
/*
 *  [ Interface ] 추상메소드
 *  
 *  - 생성자가 없다 (단독 객체 생성 불가) new 할 수 없다는 얘기
 *  - 구현된 멤버 메소드는 정의할 수 없다.(추상 메소드만 가질 수 있음)
 *  - 멤버 필드는 static final 멤버 필드만 가질 수 있다.
 *  - Data Type 역할을 할 수 있다.
 *  - 인터페이스 type 의 참조값이 필요하면 인터페이스의 구현 클래스를 만들어서
 *    객체를 생성해야 한다.
 */
public interface Remocon {
	//필드
	public static final int VERSION=1; //static final 적지 않아도 static final이다.
	public String COMPANY="LG";
	//메소드
	public abstract void up();
	public void down(); //abstract 안붙여도 된다.
}
