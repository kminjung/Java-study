package test.mypac;
/*
 *  가상의 지갑 역할을 하는 클래스
 */
public class Wallet {
	//static 멤버필드
	public static int totalmony;
	//돈을 저장하는 static 메소드
	/*
	 *  한 개 이상의 스레드에서 동일한 메소드를 사용할 때 
	 *  충돌 방지를 하기 위해서 synchronized 예약어를 메소드에 붙여준다.
	 */
	public static void addMoney(int money) {
		totalmony += money; //static 안에서는 static 참조 가능
	}
	//돈을 인출하는 static 맴버 메소드
	public static synchronized int getMoney(String name){//synchronized 했을 때 안했을 때 차이 실험
		if(totalmony>0){
			totalmony -= 1;
			System.out.println
				(name+" 가 1만원 인출! 현재 잔고:"+totalmony);
			return 1;
		}else{
			System.out.println
				(name+" 이 인출요청, 더이상 인출할 돈이 없어요");
			return 0;
		}
	}
}
