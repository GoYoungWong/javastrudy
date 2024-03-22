package chapter6.thisex;

// 다른 생성자를 호출하는 예제

class Person {
	String naem;
	int age;
	
	// 생성자
	Person(){
		this("이름없음", 1); // 생성자끼리 호출하는 구분.
	}
	Person(String name, int age){
		this.naem = name;
		this.age = age;
	}
}
public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.naem);
		System.out.println(noName.age);
		
		Person noName2 = new Person("이름없음", 1);
		System.out.println(noName2.naem);
		System.out.println(noName2.age);
		
		Person ps1 = new Person("홍길동", 100);
		System.out.println(ps1.naem);
		System.out.println(ps1.age);
				
	}

}
