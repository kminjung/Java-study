package test.mypac;

public class NoteBook {
	//필드
	public Cpu cpu; // 우리가 정의한 type
	public Memory memory;

	
	//생성자* - return type 이 없고 클래스명과 이름이 같다. 생성자를 1개라도 만들면 기본 생성자는 사라진다.
	public NoteBook(Cpu cpu, Memory memory) {
		this.cpu=cpu;
		this.memory=memory;
	}
}
