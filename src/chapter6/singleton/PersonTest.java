package chapter6.singleton;

public class PersonTest {

	public static void main(String[] args) {
		
		Person per1 = Person.getInstance();
		Person per2 = Person.getInstance();
		
		System.out.println(per1 == per2);
	}

}
