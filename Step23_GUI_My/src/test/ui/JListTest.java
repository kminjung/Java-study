package test.ui;

import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class JListTest extends JFrame{ // JListTest - 문자열 목록
	
	//생성자
	public JListTest() {
		
		//JList 에 연결할 model 객체
		DefaultListModel<String> model=new DefaultListModel<>(); //DefaultListModel-기본리스트모델
		model.addElement("김구라");
		model.addElement("해골");
		model.addElement("원숭이");
		
		//문자열 목록을 출력 할 수 있는 JList
		JList<String> list=new JList<>();
		//JList 모델 연결
		list.setModel(model); //model을 통해서 출력한 것
		//배경 색상
		list.setBackground(Color.YELLOW);
		this.add(list);
		
		this.setBounds(100, 100, 500, 500); // JFrame 을 상속받았기 때문에 쓸 수 있다. / this 생략 가능
		//종료 버튼을 눌렀을 때 process 가 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new JListTest();// 실행 할 생성자들이 있는 JListTest 객체가 생성됨 (부모클래스를 실행한 것)
	}
}
