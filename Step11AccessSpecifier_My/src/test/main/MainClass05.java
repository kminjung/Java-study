package test.main;

import test.mypac.MemberDao;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 됨");
		//MemberDao 객체는 1개만 만들어짐 참조값(id값) 이 다 똑같다.
		MemberDao dao1=MemberDao.getInstance();
		MemberDao dao2=MemberDao.getInstance();
		MemberDao dao3=MemberDao.getInstance();
		MemberDao dao4=MemberDao.getInstance();
		MemberDao dao5=MemberDao.getInstance();
	}
}
