package chapter6.cooperation;

// 학생이 통학수단으로 사용한 지하철 - 지하털 호선, 인원수, 수입
public class Subway {

	public String lineNumber;
	public int passengerCount;
	public int money;
	
	// 매개변수가 있는 생성자. 지하철 노선 초기화.
	// 고정된 정보가 있는 (힙영역에 집어늘때)데이타를 만들때 이럴때 만듬
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;    
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
		
	}
	
}
