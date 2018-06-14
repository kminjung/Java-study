package test.main;

import test.mypac.Radio; // public class Radio 가 있기 때문에 import 가능

public class MainClass01 {
	public static void main(String[] args) {
		//생성자 호출 가능 ( public Radio(){} 때문에 호출 가능)
		Radio r=new Radio();
		//메소드 호출 가능( public void ChannelUp{} 때문에 호출 가능 )
		r.channelUp();
		//필드 접근 가능 ( public int volumn )
		int result=r.volumn;
	}
}
