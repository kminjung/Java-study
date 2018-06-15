package test.mypac;

public class FruitBox<T> {
	private T item; // 여기서의 T 는 상황에 맞게끔 프로그래머가 전달하겠다는 뜻
	
	public void push(T item) {
		this.item=item;
		
	}
	public T pull() {
		return item;
	}
}
