package test.main;

import test.mypac.MemberDto;

public class MainClass03 {
	public static void main(String[] args) {
		// 1번 회원의 정보를 MemberDto 객체를 생성한 후
		MemberDto mem1=new MemberDto();
		// setter 메소드를 이용해서 저장 / 갯수가 많을 때 사용
		mem1.setNum(1);
		mem1.setName("강민정");
		mem1.setAddr("강동구");
		
		//2번 회원의 정보를 MemberDto 객체를 생성할 때 저장
		MemberDto mem2=new MemberDto(2, "밀크", "우리집"); //전달할 것이 별로 없을 때
	}
}
