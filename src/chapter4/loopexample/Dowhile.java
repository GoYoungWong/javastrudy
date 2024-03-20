package chapter4.loopexample;

// 반복문 : do~while
public class Dowhile {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		// 코드가 최소 1번은 실행이 된다.
		do {
			sum += i;
			i++;
		}while(i<100);
		
		System.out.println("1~100까지의 합은? " + sum);
		System.out.println("i변수의 값은? " + i);

	}

}
