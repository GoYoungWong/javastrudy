package chapter14.collection.arraylist;

import java.util.ArrayList;

// 자료구조 : 뮤(Queue)를 ArrayList클래스로 구현한 예제
// 큐 : First Input First Output(FIFO)
class MyQueue { 
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	// 데이터 저장(추가)
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	// 데이터 꺼내오기
	public String deQueue() {
		int ien = arrayQueue.size(); // 3
		if(ien == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return (arrayQueue.remove(0));  // 첫번쨰 데이터 삭제 하고 삭제된 데이터를 String으로 리턴해서 값을 보여줌
	}
}

// 큐(Que)자료구조
public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());  // A
		System.out.println(queue.deQueue());  // B
		System.out.println(queue.deQueue());  // C
	}

}
