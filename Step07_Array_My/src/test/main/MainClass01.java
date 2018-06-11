package test.main;
/*
 *  배열 (array)
 */

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		//String[] type
		String[] names= {"김구라","해골","원숭이","주뎅이","덩어리"};//String 배열 타입
		//배열 자체는 참조 데이터 타입니다.
		//배열을 만들 때 [] 을 사용해야 한다.
		//하나의 데이터로 여러개의 데이터를 관리할 수 있다.
		//고정된 데이터이므로 데이터를 추가할 수 없다.
		
		//0번방 참조
		String a=names[0];
		//1번방 참조
		String b=names[1];
		/*
		 * 위의 코드를 javascript 로 환산하면
		 * var names=["김구라","해골","원숭이","주뎅이","덩어리"];
		 * var a=names[0];
		 * var b=names[1];
		 */
		
	}
}
