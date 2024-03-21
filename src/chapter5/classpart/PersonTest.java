package chapter5.classpart;

public class PersonTest {

	public static void main(String[] args) {
		// person클래스 사용 - 기억장소가 생성됨 의미.
		Person ps1 = new Person();
		
		// ps1객체가 가리키는 기억장소표현
		ps1.name = "홍길동";
		ps1.height = 180;
		ps1.weigth = 75;
		ps1.gender = '남';
		ps1.married = true;
		
		ps1.getpersonInfo();
		
		System.out.println("==================================");
		
		Person ps2 = new Person();
		
		ps2.name = "고영웅";
		ps2.height = 180;
		ps2.weigth = 80;
		ps2.gender = '남';
		ps2.married = false;
		
		ps2.getpersonInfo();

		System.out.println("==================================");
		
		Person ps3 = new Person();
		
		ps3.name = "고예은";
		ps3.height = 162;
		ps3.weigth = 56;
		ps3.gender = '여';
		ps3.married = false;
		
		ps3.getpersonInfo();
		
		System.out.println("==================================");
		
		Person ps4 = new Person();
		
		ps4.name = "김민정";
		ps4.height = 161;
		ps4.weigth = 78;
		ps4.gender = '여';
		ps4.married = true;
		
		ps4.getpersonInfo();
		
		System.out.println("==================================");
		
		Person ps5 = new Person();
		
		ps5.name = "고중곤";
		ps5.height = 170;
		ps5.weigth = 56;
		ps5.gender = '남';
		ps5.married = true;
		
		ps5.getpersonInfo();
	}

}
