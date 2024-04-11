package chapter16.stream.other;

import java.util.Scanner;  // Scanner클래스를 패키지명없이 사용가능하게 해주는 의미 

// Scanner 클래스 사용. : 키보드를 통하여 입력받는 데이터를 더 쉽고, 편하게 만든 특징.
public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name =  scanner.nextLine();  // 입력데이터를 String
		System.out.println("직업: ");
		String job =  scanner.nextLine();
		System.out.println("사변: ");
		int num =  scanner.nextInt();  // 입력데이터를 int
		
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
		
		
	}

}
