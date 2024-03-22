package chapter6.referenc2;

public class ProductTest {

	public static void main(String[] args) {
		Product P1 = new Product("TV", 50000);
		
		Product P2 = P1; // 힙영역의 주소가 P1에 의하여 P2에 복사가되서, 힙영역의 기억장소를 공유하게 된다.
		
		P2.price = 10000;
		
		System.out.println("P1.price필드의 값은? " + P1.price); // 10000

	}

}
