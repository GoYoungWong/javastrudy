package chapter6.staticex;

public class StudentTest {

	public static void main(String[] args) {
		// JVM이 main()메소드를 호출하면서, 프로그램이 실행될 때, Student 클래스의 static 필드와 메서드를 이용하여, 
		// static area 에 메모리를 단 1번만 생성. 공유의 목적
		
		Student stu1 = new Student(); // 스택영역: 힙영역에 생성된 주소를 저장. 힙영역: 실제데이터를 저장
		stu1.setStudentName("손흥민");
		// static 메서드는 클래스명.메서드명()으로 호출햐야 한다. 객체.메서드명()으로 호출은 되나, 사용하지 말것.
		// static 영역에 기억장소에 호출 -> 기본값 0 -> Student 에 ++이 있어 1중가 -> 1출력
		System.out.println(Student.getSerialNum()); // 1
		
		Student stu2 = new Student(); // 스택영역과 힙영역에 메모리 생성
		stu2.setStudentName("김민재");
		// static 영역에 기억장소에 호출 -> 위에값이 공유가되어 1이된 상태 -> Student 에 ++이 있어 1중가 -> 2출력
		System.out.println(Student.getSerialNum()); // 2

	}

}
