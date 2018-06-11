package test.main;//패키지 명

import test.mypac.Person;//person 클래스와 연결한 것
/*
 *  1. test.mypac 패키지에 Person 이라는 이름의 클래스를 만들기
 *  2. static 을 붙이지 않고 필드 1개 정의하기
 *  3. static 을 붙이지 않고 메소드 2개 정의하기
 *  4. main() 메소드에서 Person 클래스를 이용해서 객체 생성 후 2개의 메소드를 호출해보기.
 */
public class MainClass07 {
	public static void main(String[] args) {
		Person p=new Person(); // 우리가 만든 클래스 정의
		p.sing();//클래스의 기능
		p.study();//클래스의 기능
		
	}
}
