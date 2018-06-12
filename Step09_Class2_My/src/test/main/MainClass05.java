package test.main; // 선생님꺼 확인하기

import test.mypac.Cpu;
import test.mypac.Memory;
import test.mypac.NoteBook;

public class MainClass05 {
	public static void main(String[] args) {
		//NoteBook 객체 생성
		NoteBook n1=new NoteBook(new Cpu(), new Memory());
		
		//생성자의 인자로 전달할 객체를 미리 생성하고
		Cpu c=new Cpu();
		Memory m=new Memory();
		

	}

}
