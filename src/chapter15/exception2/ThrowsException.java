package chapter15.exception2;

// 예외처리 
import java.io.FileInputStream;

public class ThrowsException {

	// 예외처리를 한 상태
	public Class loadClass(String fileName, String className)   {
		Class c = null;
		try {
		FileInputStream fis = new FileInputStream(fileName);
		c = Class.forName(className);
		}catch (Exception ex) {
			}
		
		return c;
	}
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		
		// multi catch 사용시 여러 예외가 발생한 경우, 가장 큰 예외클래스가 맨마지막에 사용해야 한다.
		test.loadClass("a.txt", "java.lang.String");
		

	}

}
