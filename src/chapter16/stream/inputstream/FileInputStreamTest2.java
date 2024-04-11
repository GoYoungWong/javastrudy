package chapter16.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 파일의 내용이 끝인지 아닌지를 while문으로 확인하여, 끝까지 읽어오는 예제.
public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		// try() : 객체를 생성하면, 자동으로 close()메서드가 내부적으로 호출된다.
		// 단, 사용클래스는 Closeable 인터페이스를 상속받아야 한다.
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			
			int i;
			
			// read()메서드가 읽어온 값이 없을 때 -1 리턴한다.
			// read() : 1byte씩 읽어오기
			// 문자하나를 읽어오고, 다음문자 위치로 포인터를 이동하는 기능을 제공한다.
			// Enter 코드값(13)도 같이 가지고와서 줄바꿈이 된다. 그리고 커서를 맨 앞으로 가지고 오는 코드값(10)도 가지고옴
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
