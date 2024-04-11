package chapter16.stream.other;

import java.io.Console;

// jdk버전으로 인한 예제 실행이 안됨.
// Console클래스 : 내부적으로 System,in을 사용하지 않고, 콘솔내용을 읽을 수 있는 기능을 제공.
public class ConsoleTest {

	public static void main(String[] args) {
		
		Console console =  System.console();
		
		System.out.println("이름: ");
		String name = console.readLine();
		System.out.println("직업: ");
		String job = console.readLine();
		
		System.out.println("비밀번호: "); // 1234
		char[] pass = console.readPassword(); 
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}

}
