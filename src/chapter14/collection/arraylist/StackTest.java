package chapter14.collection.arraylist;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	// 데이터 추가
	public void push(String data) {
		arrayStack.add(data);
	}
	
	// 데이터꺼내오기
	public String pop() {
		int ien = arrayStack.size();
		if(ien == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return(arrayStack.remove((ien) - 1));
	}
}

// 자료구조: ArrayList클래스를 이용하여, 스택을 구현한 예제
// 스택 : Last Input First Output(LIFO)
public class StackTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		// 데이터 저장(추가)하기.  데이터저장순서: A, B, C 
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		// 데이터 꺼내오기   데이터꺼내오는 순서 : C, B, A
		System.out.println(stack.pop()); // C
		System.out.println(stack.pop()); // B
		System.out.println(stack.pop()); // A
		
	}

}
