package chapter5.classpart2;

// 객체: 자동차
/*
  - 속성 : 성격, 성질, 특성
       속도, 모델, 색상
       프로그램 : 변수
  - 기능및동작
       운전하다, 정지하다.
       프로그램 : 메서드
*/

// Car.java파일을 컴파일하면 Car.class 파일에 Car() 기본생성자가 자동으로 생성된다.
// Car.java파일에 Car(int speed) 매개변수가 있는 생성자를 정의하면,
// Car.class 파일에 Car() 기본생성자가 생성되지 않도록 설계를 해두었다.
public class Car { // 설계도
	
	// 필드 : 클래스에서 설계된 변수를 구분하기위해하여 부르는 이름.
	// 필드는 같은 이름 못씀
	String company;
	int speed;
	String model;
	String color;
	boolean isAircon;
	
	// void : 리턴값이 없는 메서드를 작성할 때 사용
	// 운전기능.
	void drive() {
		
	}
	
	// 정지기능.
	void stop() {
		
	}
	
	// 생성자메서드 정의. 일반메서드랑 만드는 문법이 조금 틀리다.
	// 생성자메서드를 여러개를 만들떄 매개변수의 개수와 데이타타입이 다르게 만들어야 한다.(규칙) - 생성자 오버로딩
	//Car(int speed) {}


    Car(String company) {
	   this.company = company;
    }
    
    Car(String company, String color) {
    	this.company = company;
    	this.color = color;
    }
    
    Car(boolean isAricon) {
    	this.isAircon = isAricon;
    }
    
    // 위의 매개변수가 있는 생성자로 인하여, 기본생성자가 컴파일과정에서 생성되지 않도록 설계되어 있기때문에
    // 기본생성자를 사용하고 싶으면, 수동으로 생성해야 한다.
    Car() {}
}