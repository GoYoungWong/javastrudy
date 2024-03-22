package chapter5.hiding;

//default 필드는 동일한 패키지 일경우는 접근
public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.day = 1;     // public
		date.month = 10;  // default는 public
	//	date.year = 2024; private접근자로 되어있기때문에 접근이 안되는 특징이 있다.

	}

}
