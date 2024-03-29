package chapter11.classex;

public class Person /* extends Object */{
	
	private String name;
	private int age;
	
	// 기본생성자
	public Person() {}
	
	// String name 필드사용하는 생성자
	public Person (String name) {
		this.name = name;
	}
	// String name, int age 2개 매개변수이용하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// getter/setter
	
	public String getName(){
		return name;
	}
	
    public void setName(String name) {
    	this.name = name;
    }
    
    public int getAge() {
    	return age;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
}
