package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class PersonClass = Class.forName("chapter11.classex.Person");

		// Person클래스의 생성자정보 출력
		Constructor[] per = PersonClass.getConstructors();
		
		for(Constructor c : per) {
			System.out.println(c);
		}
		
		System.out.println();
		
		// Person클래스의 필드 출력
		Field[] per1 = PersonClass.getFields();
		for(Field p : per1) {
			System.out.println(p);
		}
		
		System.out.println();
		
		// Person클래스의 메서드 출력
		Method[] method = PersonClass.getDeclaredMethods();
		for(Method m : method) {
			System.out.println(m);
		}
	
	
	
	
	}

}
