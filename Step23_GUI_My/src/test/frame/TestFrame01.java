package test.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestFrame01 extends JFrame{
	//생성자
	public TestFrame01() {
		//버튼 객체 생성해서
		JButton button=new JButton("눌러보셈");
		//버튼에 액션 리스너 등록하기 / button 객체의 메소드 호출 /파란색으로 나오는 것은 필드 / 주황색은 지역변수
		button.addActionListener(listener);//listener - 버튼을 눌렀는지 안눌렀는지 감시할 객체
		
		//이 프레임에 추가하기
		this.add(button);
		
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//컨+스 자동완성
		setVisible(true);
	}
	//ActionListener type 객체를 필드로 정의하기
	ActionListener listener=new ActionListener() {		
		@Override
		public void actionPerformed(ActionEvent e) {//버튼 눌렀을 때 실행할 동작 코딩하기
			//System.out.println("버튼을 눌렀네?");
			//메세지 다이얼로그 띄우기
			JOptionPane.showMessageDialog
				(TestFrame01.this, "버튼을 눌렀네?");
		}
	};
	public static void main(String[] args) {
		new TestFrame01();
	}
	
}
