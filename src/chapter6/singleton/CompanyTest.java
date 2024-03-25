package chapter6.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		// 싱글톤 페턴 클래스로 객체생성 불가능
//		Company company = new Company();
		
		// com1, com2, com3 은 미리생성된 동일한 객체의 주소를 갖게된다.
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		
		System.out.println(com1 == com2);
		
	}

}
