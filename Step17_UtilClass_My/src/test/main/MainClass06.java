package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		//Generic 은 Object 이지만 Car 객체를 담을 수 있다.
		list.add(new Car());
		list.add(new Car());
		list.add(new Car());
		
		//0번방 참조
		Object car1=list.get(0);
		//1번방 참조 (casting 하면 Car type 으로 받을 수 있다.)
		Car car2=(Car)list.get(1);
		
		//Generic 는 모든 객체를 받을 수 있지만 casting 해야 한다는 불편감이 있다.
	}
}
