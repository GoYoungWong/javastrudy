package chapter02;

// 형변환(Casting) : 데이타타입변환
// 묵시적 형변환
public class ImplicitConversion {

	public static void main(String[] args) {
		
		// 정수데이타타입 크기 순서 : byte(1) < short(2) < int(4) < long(8)
		
		
		byte bNum = 10; // 크기 1바이트
		
		// 1바이트 10이 4바이트 10으로 형변환되어 좌측에 타입과 일치되어 변수에 대입된다.
		int iNum = bNum; //    4바이트 = 1바이트 해석: int iNum = (int) bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		// 정수데이타타입보다는 실수데이타타입이 크다. (설계)
		
		int iNum2 = 20;
		float fNum = iNum2; // 해석: float fNum = (float) iNum2;
		
		System.out.println(iNum2); //20
		System.out.println(fNum); // 20.0f
		
		
		double dNum;
		
		// 우측의 연산코드도 큰데이타타입으로 변환되어 연산된다.
		dNum = fNum + iNum; // fNum + iNum 해석: (float) + (int) -> (float) + (float)
 	
		System.out.println(dNum);
	
	}

}
