package test.mypac;
/*
 *  [ 접근 지정자(Access Specifier) ]
 *  
 *  종류 : public, protected, default(작성안한경우), private
 *  
 *  public -> 어디서든 자유롭게 접근 가능
 *  protected -> 같은 package + 상속관계의 자식 (패키지는 달라도 상속관계이면 접근 가능)
 *  default -> 같은 package 내에서만 접근 가능
 *  private -> 같은 클래스 내에서만 접근 가능 (외부에 공개를 하지 않겠다.비공개)
 *  
 *  접근 지정자를 작성할 수 있는 위치:
 *  1. 클래스 (public or default 두 개만 가능)
 *  2. 생성자
 *  3. 필드
 *  4. 메소드
 */
public class Radio { //여기서 public 이 없으면 같은 패키지 내에서만 Radio 사용 가능
	//필드
	public int volumn;
	//생성자
	public Radio() {
		
	}
	//메소드
	public void channelUp() {
		
	}
}
