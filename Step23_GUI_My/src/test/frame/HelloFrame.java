package test.frame;

import javax.swing.JFrame;

/*
 * 	[ GUI Frame 만들기 ] 그래픽 유저 인터페이스
 * 
 * 	- JFrame 클래스를 상속받은 클래스를 정의한다.
 * 	- 해당 클래스로 객체 생성을 한다.
 */	
public class HelloFrame extends JFrame{
	//생성자 (클래스명이 똑같고 return type 이 없다.)
	public HelloFrame() {
		//크기와 위치 설정 .setBounds(x, y, width, height)
		//m(상속관계에 있는 모든 메소드를 this 할 수 있다. 나의 참조값을 가리키는 것)
		//객체 안에서 자기 자신의 참조값(this.)은 생략할 수 있다.
		this.setBounds(100, 100, 300, 300);
		//제목 설정
		setTitle("제목입니다.");
		//x 를 눌렀을 때 프로세스가 종료되도록 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);//EXIT_ON_CLOSE static 은 finally / 객체 안에서 자기 자신의 참조값(HelloFrame.)은 생략할 수 있다.
		//화면에 보이도록 설정
		setVisible(true);
	}
	
	//HelloFram 클래스로 객체를 생성하기 위한 main 메소드
	public static void main(String[] args) {
		new HelloFrame();
	}
}
