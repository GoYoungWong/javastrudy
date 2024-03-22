package chapter5.exam;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		
		System.out.println("제품이름: " + p1.name);
		System.out.println("제품가격: " + p1.price);
		
System.out.println("===================================");
		
		Product p2 = new Product("TV", 500000);
		
		System.out.println("제품이름: " + p2.name);
		System.out.println("제품가격: " + p2.price);
	}

}
