package chapter6.staticex;

// JVM이 운영체제(OS)로부터 메모리 할당을 위임받아서, 자바프로그램을 실행할때, 사용되는 메모리의 영역을 학습하는 예제.
// static area(method area) : 정적영역
// 책은 예제의 단순함을 위하여, 필드의 접근자를 public 을 사용했으나, 실제개발에서는 필드는 private, public getter/setter 메서드사용.
public class Student {

	// 필드선언
	// 필드가 private 접근자일 떄만 getter/setter 메서드를 정의한다.
	// 문법> 접근자 [static 선택] 데이타타입 변수;
	
	// 자바프로그램이 실행될 때, JVM이 클래스의 내용을 보고, static 키워드를 사용하는 필드, 메서드에 대하여 static area 메모리를 생성한다. 단, 1번만
	// static 핃드(정적필드), 클래스변수.
	private static int serialNum; // static 필드를 접근하는 메서드는 static 이어야한다.
	
	// 인스턴스(instance) 필드 : Student stu1 = new Student(); 객체생성구문이 실행이 될떄만 stack, heep 영역의 메모리를 사용 
	private int studentId;
	private String studentName;
	private int grade;
	private String address;
	private int count;
	
	// getter 메서드 : studentName필드로 생성된 기억장소의 값을 읽어오기위한 목적의 메서드
	// 읽어오는거이기 떄문에 매개변수가 필요없음
	public String getStudentName() {
		return studentName;
	}
	
	// setter 메서드는 void 이어야한다.
	// setter 메서드 : 값을 변경하고 저장하는 목적의 메서드
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	// int grade;
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		// serialNum++; 사용가능. static 필드또는 메서드는 jvm 이 자동으로 메모리를 생성해주기 떄문, 인스턴스 메서드가 호출이 된다면, 먼저생성되어 있는 메모리 접근이 당연하므로 문제가 안된다.
		this.grade = grade;
	}
	
	// String address;
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//int count
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	// static int serialNum;
	public static int getSerialNum() {
//		studentName = "홍길동";  에러방생.  
		serialNum++;
		
		// static 필드는 클래스명.static 필드로 기억장소를 접근한다.
		return Student.serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		
		// static 필드는 클래스명.static 필드로 기억장소를 접근한다.
		Student.serialNum = serialNum;
	}
}
