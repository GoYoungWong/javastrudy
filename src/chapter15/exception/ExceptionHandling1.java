package chapter15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// 파일 입출력기능을 제공하는 클래스
		FileInputStream fis = null;
		
		// new FileInputStream("a.txt"); 이 구문은 문법적으로 예외관련 작업을 하도록 규칙이 존재한다.
		// 예외처리 : try~catch 구문작업을 강제적으로 하게됨.
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

}
