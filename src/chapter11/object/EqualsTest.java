package chapter11.object;

class Student /* extends Object */{
	int studentid;
	String studentName;
	
	// 힙영역에 생성된 필드 기억장소를 초기화 하기위해 새로운값을 넣기위해
	public Student(int studentid, String studentName) {
		// super(); 컴파일하면, 자동생성됨.
		this.studentid = studentid;
		this.studentName = studentName;
	}
	
	/*@Override
	public String toString() {
		return studentid + "," + studentName;
	}*/

	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		// 주소값 
		return super.hashCode(); 
		//return studentid;  // 손흥민의 등넘버값 7
	}
	
	// st1.equals(st3)
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()메서드");
//		return super.equals(obj); // super : Object를 가리킴 지금은 주소를 비교하는 성격임
		// st1과 st3의 객체가 가리키는 힙영역의 데이타를 비교하는 구문.
		if(obj instanceof Student) {
			Student std = (Student) obj;
			    // st1            st3           st1            st3
			if(studentid == std.studentid && studentName.equals(std.studentName))
				return true;
			else 
				return false;
		}
		return false;
	}
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student st1 = new Student(7, "손흥민");
		Student st2 = st1; // 객체의 주소대입
		
		Student st3 = new Student(7, "손흥민");
		
		// st1객체의 주소와 st3객체의 주소는 다르다.
		
		// 주소비교
		if(st1 == st2) {
			System.out.println("st1과 st2는 주소가 같습니다.");
		}else {
			System.out.println("st1과 st2는 주소가 같지않습니다.");
		}
		
		// equals()메서드 : Object클래스에서도 주소값으로 비교.
		if(st1.equals(st2)) {
			System.out.println("st1과 st2는 주소가 동일하다.");
		}else {
			System.out.println("st1과 st2는 주소가 동일하지않다.");
		}
		
		// 주소비교
		if(st1 == st3) {
			System.out.println("st1과 st3는 주소가 같습니다.");
		}else {
		    System.out.println("st1과 st3는 주소가 같지않습니다.");
		}
		
		// equals()메서드 : Object클래스에서도 주소값으로 비교하지 말고 객체가 참조하는 힙영역의 데이터로 비교하여 판단할수 있도록 equals()메서드를 재정의
		if(st1.equals(st3)) {
			System.out.println("st1과 st3는 주소가 동일하다.");
		}else {
			System.out.println("st1과 st3는 주소가 동일하지않다.");
		}
		
		// 정리
		// 객체비교시 내부적으로 Object클래스의 equals(), hashCode()메서드가 동작한다.(주소값으로 비교)
		// 객체가 참조하고 있는 힙역역의 데이터로 비교하도록 equals(), hashCode()메서드를 재정의.
		
		// toString()메서드가 자동으로 호출
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		// 해쉬코드값 : 힙영역의 기억장소를 가리킬떄 사용하는 코드값.
		System.out.println(st1.hashCode()); // 1694819250
		System.out.println(st2.hashCode()); // 1694819250
		System.out.println(st3.hashCode()); // 1365202186
		
	}

}
