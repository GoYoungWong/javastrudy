package chapter02;

public class CharacterEx1 {

	public static void main(String[] args) {
		// 문자형 데이타타입 : char(2)
		// char 데이타타입으로 만든 기억장소에는 값은 ''작은따음표로 표현.
		// 문자1개만 저장하는 목적.
		// 문자로 저장되지만 내부적으로는 숫자의 의미를 가지고 있다.
		// 문자로 해석해서 사용된다.
		// 아스키, 유니코드 사용. 유니코드값은 0~65535범위로 사용.
		
		// 문자1개를 저장.
		char ch1 = 'A';
		System.out.println(ch1); // 문자 출력 A
		System.out.println((int)ch1); // 문자의 해당하는 숫자값 출력
		
		// 숫자를 저장.
		char ch2 = 66;
		System.out.println(ch2); // 문자 출력 B
		
		int ch3 = 67;
		System.out.println(ch3); // 숫자 67 출력
		System.out.println((char)ch3);
	
	}

}
