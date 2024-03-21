package chapter5.classpart2;

// Student 클래스에 main() 메서드 사용하기.
public class Student {
	
	//학생정보
	//필드
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//메서드
	public String getStudentName() {
		
		return studentName;
	}
	
	// Student클래스의 멤버가 아니다. 
	// 일반적으로 main()매소드를 독립적인 파일로 사용한다. 
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.studentName = "홍길동";
		
		// "홍길동" 이 저장된 데이타를 출력
		// 실제 작업을 하는 경우에는 필드를 직접접근하지 않고, 메서드를 이용하여, 필드갑을 읽어온다.
		System.out.println(stu1.studentName); // 필드사용 - 직접접근해서 결과나옴
		System.out.println(stu1.getStudentName()); // 메서드사용 - 메서드를 거쳐서 결과나옴
	}

}
