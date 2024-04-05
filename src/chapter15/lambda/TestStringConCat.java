package chapter15.Lambda;

public class TestStringConCat {

	public static void main(String[] args) {
		
		
		String s1 = "Helle";
		String s2 = "World";
		
		// 1)StringConcat인터페이스를 구현한 클래스 객체생성.(기본적인 사용)
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);
		
		// 2)StringConcat 함수형인터페이스의 makeString()추상메서드를 람다식문법으로 구현.
		StringConcat concat2 = (s, v) -> System.out.println(s + ", " + v);
		concat2.makeString(s1, s2);
		
		// 3)익명구현객체로 사용(일회성) 다른 파일에서 아래내용을 참조 할수가 없다.
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
				
			}
		};
		concat3.makeString(s1, s2);
		
	
	}

}
