package example2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket; //네트워크 패키지
import java.net.Socket;

import example3.ServerThread;

public class ServerMain {//서버 역할을 할 프로그래밍
	public static void main(String[] args) {
		//필요한 객체를 담을 변수 만들기
		ServerSocket serverSocket=null;	
		try {
			serverSocket=new ServerSocket(5000);
			//무한 루프를 돌면서
			while(true) {
				//클라이언트의 접속을 기다린다.
				Socket socket=serverSocket.accept();
				System.out.println("클라이언트가 접속!");
				//생성자의 인자로 Socket 객체의 참조값 전달해서
				//스레도 객체를 생성 후 
				Thread t=new ServerThread(socket);
				//스레드를 시작 시킨다.
				t.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket!=null)serverSocket.close();
			}catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
//accept() - 바로 옆에 있는 것은 아무것도 리턴 해 주지 않으면 void 다.