package example3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket; //네트워크 패키지
import java.net.Socket;

public class ServerMain {//서버 역할을 할 프로그래밍
	public static void main(String[] args) {
		//필요한 객체를 담을 변수 만들기
		ServerSocket serverSocket=null;
		Socket socket=null;
		
		try {
			// 5000번 port 에서 클라이언트의 접속을 기다릴 수 있는 
			// ServerSocket 객체 생성해서 참조값을 변수에 담기
			serverSocket=new ServerSocket(5000);
			//무한 루프를 돌면서
			while(true) {
				//클라이언트의 접속을 기다린다.
				socket=serverSocket.accept();
				// ↑ 아직 return 을 안함 클라이언트가 5000번 포트에 접속,연결 했을 때 return함 m
				// socket 변수 안에는 방금 연결 요청을 한 클라이언트와 연결 된
				// Socket 객체의 참조 값이 들어있다.
				String ip=socket.getInetAddress().getHostAddress();
				// 클라이언트가 전송하는 데이터를 읽어 들일 수 있다.
				InputStream is=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(is);
				BufferedReader br=new BufferedReader(isr);
				//클라이언트가 전송한 문자열 읽어내기
				String msg=br.readLine();
				//콘솔창에 출력하고
				System.out.println(ip+":"+msg);
				//Socket 객체 닫기
				socket.close();
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