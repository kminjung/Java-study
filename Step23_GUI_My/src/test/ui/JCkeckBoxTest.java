package test.ui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCkeckBoxTest extends JFrame
								implements ItemListener{ // 선생님꺼 확인
	//필드
	JCheckBox ck1, ck2;
	public JCkeckBoxTest() {
		ck1=new JCheckBox("Java");
		ck1.setBounds(10,10,50,50);
		
		ck2=new JCheckBox("C++");
		ck2.setBounds(10,60,100,50);
		
		add(ck1);
		add(ck2);
		
		//JcheckBox 에 ItemListener 객체 등록
		ck1.addItemListener(this);
		ck2.addItemListener(this);
		
		
		setLayout(null);
		
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JCkeckBoxTest();
	}
	//아이템의(JCheckBox) 상태가 바뀌었을 때 호출되는 메소드
	@Override
	public void itemStateChanged(ItemEvent e) {
		//이벤트가 발생한 객체의 참조값 얻어오기
		Object which=e.getSource();
		
		if(which==ck1) { //Java 체크박스에 발생한 이벤트
			System.out.println("Java!");
			boolean isJavaSelected=ck1.isSelected();
			System.out.println("체크여부:"+isJavaSelected);
		}else if(which==ck2) { //C++ 체크박스에 발생한 이벤트
			System.out.println("C++!");
			boolean isCppSelected=ck2.isSelected();
			System.out.println("체크여부:"+isCppSelected);
		}
		
	}
}
