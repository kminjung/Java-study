package test.mypac;//자바에서 상속이 어떤 의미를 갖고 있는가?

public class Phone extends Object {
	/*
	 * 어떤 생성자를 생성하지 않아도 기본 생성자가 있다.( public Phone(){} 가 있다.)
	 * but 생성자를 하나라도 생성하면 기본 생성자는 사라진다.
	 * 
	 * 어떤 클래스를 상속받고 싶으면 extends 를 쓰고 상속받고 싶은 클래스를 명시한다.
	 * but extends 쓰지 않아도 Object 는 자동으로 쓰여 있다.
	 * 그래서 Phone . 을 하면 object 들이 뜨는 것이다.
	 */
	
	public void call() {
		System.out.println("전화를 걸어요!");
	}
}
