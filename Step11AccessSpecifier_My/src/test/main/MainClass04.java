package test.main;

import test.mypac.MemberDao;

public class MainClass04 {
	public static void main(String[] args) {
		//MemberDao 객체의 참조값을 리턴해 주는 메소드를 호출해서 참조값을 얻어낸다.
		//클래스명(MemberDao. 해서 참조값을 얻어낸다.)m
		MemberDao dao=MemberDao.getInstance();
		
		dao.insert();
		dao.delete();
	}
}
