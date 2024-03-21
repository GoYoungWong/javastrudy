package chapter5.classpart;

public class StudentVariable {

	public static void main(String[] args) {
		// 학생관련정보
		// 학번, 이름, 학년, 주소지
		
		int studentID;
		String studenName;
		int grade;
		String address;
		
		studentID = 1;
		studenName = "홍길동";
		grade = 4;
		address = "노원구";
		
		System.out.println("학번은? " + studentID);
		System.out.println("이름은? " + studenName);
		System.out.println("나이는? " + grade);
		System.out.println("주소는? " + address);
		
		System.out.println("===========================================");
		
		int studentID2;
		String studenName2;
		int grade2;
		String address2;
		
		studentID2 = 2;
		studenName2 = "송홍민";
		grade2 = 3;
		address2 = "중랑구";
		
		System.out.println("학번은? " + studentID2);
		System.out.println("이름은? " + studenName2);
		System.out.println("나이는? " + grade2);
		System.out.println("주소는? " + address2);


	}

}
