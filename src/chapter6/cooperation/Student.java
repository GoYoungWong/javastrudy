package chapter6.cooperation;

// Bus, Subway 클래스를 먼저 작업을 하고, Student클래스를 이후에 작업해야 한다. 
public class Student {

	public String studentNumber;
	public int grade;    
	public int money; 
	
	// 매개변수가 있는 생성자.
	public Student(String studentNumber, int money) {
		this.studentNumber = studentNumber;
		this.money = money;
	}
	
	// 학생이 이용하는 교통수단
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentNumber + "님의 남은 돈은 " + money + "입니다.");
	}
}
