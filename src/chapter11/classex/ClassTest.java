package chapter11.classex;

// Class 객체를 생성하는 방법
public class ClassTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		// Person.class
		Person person = new Person();
		// 1)
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		// 2)
		Class pClass2 = Person.class; // 직접 class파일 사용.
		System.out.println(pClass2.getName());
		// 3)
		Class pClass3 = Class.forName("chapter11.classex.Person");
		System.out.println(pClass3.getName());
   }
}