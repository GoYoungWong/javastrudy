package chapter4.loopexample;

// 중지.
public class BreakExample {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		for(i = 0; i <= 10; i++) {
			System.out.println(i);
			
			// 아래 구문이 true가 되면, break문이 동작하여, for문이 종료된다.
			// 5다음은 출력되지 않음.
			if(i == 5) {
			break; // 문법안에서 if문에 맞는 조건이 나오면 for문이 그대로 종료함
			}
		}
	}

}
