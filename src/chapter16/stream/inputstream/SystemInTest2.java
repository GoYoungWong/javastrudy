package chapter16.stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		
		try {
			// (i = System.in.read())
			// i != '\n'
			// 키보드를 이용하여 임의의 키를 누르고, 마지막에 Enter 키를 누르면 10진수 13으로 처리되고, 문자로 표현시 \n 으로 나타낸다.
			while((i = System.in.read()) != '\n') { // Enter 키를 누르지 않았을 동안에는 
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
