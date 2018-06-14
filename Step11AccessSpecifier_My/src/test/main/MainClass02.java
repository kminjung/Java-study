package test.main;

import test.mypac.MemberDto;

public class MainClass02 {
	public static void main(String[] args) {
		//MemberDto 객체 생성해서
		MemberDto mem1=new MemberDto();
		//회원 한 명의 정보 담기 (정보를 담을 때는 set.을 이용하자)
		mem1.setNum(1);
		mem1.setName("강민정");
		mem1.setAddr("강동구");
		//저장된 회원정보 불러오기 (불러올 때는 get. 을 이용하자)
		int num=mem1.getNum();
		String name=mem1.getName();
		String addr=mem1.getAddr();
	}
}
