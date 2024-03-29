package chapter11.wrapper;

// Wrapper클래스
/*
 기본타입을 객체관점으로 사용할 떄 기능을 제공한다.
                        
 기본데이터타입             Wrapper클래스
 boolean                Boolean
 byte                   Byte
 char                   Character
 short                  Short
 int                    Integer
 long                   Long
 float                  Float
 double                 Double
 */
public class IntegerTest {

	public static void main(String[] args) {
		
		// Boxing과UnBoxing
		// Boxing: 기본형을 객체형으로 변환하여 저장하는 것. 
		// UnBoxing: 객체형을 기본형으로 꺼내오는 것.
		// 참조타입클래스 변수 = 기본데이타 타입값;
		// 100 데이터가 힙영역에 기억장소를 생성하고, 들어가는 과정을 Boxing이라는 형변환 이 진행된다.
		Integer num = 100; // Boxing
		int iNum = num.intValue(); // Integer클레스에서 정수값만 가져옴.. UnBxing
		int jNum = 200;
		
		int sum = iNum + jNum;
		System.out.println(sum);
	}

}
