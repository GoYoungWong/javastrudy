package chapter3.operator;

// 증감연산자 : ++, --
// 변수앞 또는 변수뒤에 사용되느냐에 따라 동작(해석)이 달라진다.
public class OperationEX2 {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
		// ++변수 앞에 사용되면, +1을 변수에 적용한 후 값을 읽어온다.
		int lastScore = ++gameScore; //전위형증감연산자
		System.out.println(lastScore); // 151
		
		// --변수 앞에 사용된면. -1을 변수에 적용한 후 값을 읽어온다.
		int lastScore2 = --gameScore;
		System.out.println(lastScore2); //150
		
		System.out.println(gameScore);
		
		
	}
	

}
