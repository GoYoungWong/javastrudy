package chapter3.operator;

// 증감연산자 : ++, --
// 변수앞 또는 변수뒤에 사용되느냐에 따라 동작(해석)이 달라진다.
public class OperationEX2_2 {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
		// 변수++ 사용되면, 변수의 값을 먼저 읽어와서 좌측에 대입하고, 나중에 변수에 +1을 적용한다.
		int lastScore = gameScore++; //전위형증감연산자
		System.out.println(lastScore); // 150
		
		// 변수-- 사용되면, 변수의 값을 먼저 읽어와서 좌측에 대입하고, 나중에 변수에 -1을 적용한다.
		int lastScore2 = gameScore--;
		System.out.println(lastScore2); //151
		
		System.out.println(gameScore);
	}
	

}
