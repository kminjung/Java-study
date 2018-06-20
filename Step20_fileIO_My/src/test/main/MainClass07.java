package test.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		// 1.필요한 지역변수 미리 만들기
		FileReader fr=null;
		BufferedReader br=null; //문자를 읽어들이거나 출력할 때
		
		try {
			//2.file 에서 문자열을 읽어들일 FileReader 객체 생성
			fr=new FileReader("c:/myFolder/gura.txt");
			br=new BufferedReader(fr);
			while(true) {//한줄 읽기를 반복해서 gura 의 내용을 다 출력하기
				//BufferedReader 객체를 이용해서 한줄 읽어들이기
				String line=br.readLine();
				if(line==null) {// 만약에 line이 null 이면
					break;//반복문 탈출
				}
				System.out.println(line);
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally {//예외가 발생하던 안하던 반드시 실행이 보장
			//3.마무리 작업
			try {
				//null 이 아닐 때
				if(fr!=null) {
					// .close() 메소드를 호출한다.
					fr.close();
				}
				if(br!=null)br.close();//작업이 끝나면 안전하게 닫아준다는 개념
			}catch(IOException ie) {}
		}
	}
}
//정확한 반복 횟수를 알 수 없을 때 while 을 사용한다.
/*
 * ufferedReader / BufferedWriter는 문자 입력 스트림으로부터 문자를 읽어 들이거나
 * 문자 출력 스트림으로 문자를 내보낼 때 버퍼링을 함으로써 문자, 문자 배열, 문자열 라인 등을
 * 보다 효율적으로 처리할 수 있도록 해준다.
 */

