package chapter6.cooperation;

// 학생이 통학운송수단으로 사용한 버스 - 버스노선, 인원수, 수입
public class Bus {

	public int busNumber; // 버스번호
	public int passengrCount; // 승객수
	public int money; // 버스 수입액
	
	// 매개변수가 있는 생성자.
	// 생성자는 리턴타입이 없음
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 버스에 승객을 태우는 기능
	public void take(int money) {
		this.money += money;
		passengrCount++;
	}
	
	// 버스의 수입액과 승객인원수 확인
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번 승객은 " + passengrCount + "명이고, 수입은 " + money + "입니다.");
	}
}
