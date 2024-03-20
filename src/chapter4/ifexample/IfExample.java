package chapter4.ifexample;

// 단일if문 : 조건식이 1개일 떄 사용.
public class IfExample {

	public static void main(String[] args) {
		
		boolean isMarried = true;
		
		if(isMarried) {
			System.out.println("기혼입니다.");
		}
		// true나 false가 나오는 변수에는 is를 붙여서 한다. 그냥 관례다. 규칙은 아님
		boolean isEven;
		int num = 10;
		
		// 해석: (num % 2 == 0) 코드가 true이면 true가 대입되고 아니면 false가 대입된다.
		isEven = (num % 2 == 0) ? true:false;
		System.out.println(isEven);
		
	
	}

}
