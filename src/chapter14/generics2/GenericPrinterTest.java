package chapter14.generics2;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// 제네릭 클래스를 사용. 객체생성
		// 1)Power클래스 사용가능
//		GenericPrinter<참조타입>
		// 밑에 처럼 코드를 작성하면 T가 전부 Power로 바뀜
		GenericPrinter<Power> PowerPrinter = new GenericPrinter<Power>();
		
		PowerPrinter.setMaeterial(new Power());
		Power power = PowerPrinter.getMaeterial();
		System.out.println(PowerPrinter);
		
		// 밑에 처럼 코드를 작성하면 T가 전부 Plastic로 바뀜
		// 2) Plastic클래스 사용가능
		GenericPrinter<Plastic> PlasticPrinter = new GenericPrinter<Plastic>();
		
		PlasticPrinter.setMaeterial(new Plastic());
		Plastic plastic = PlasticPrinter.getMaeterial();
		System.out.println(PlasticPrinter);
		
		
		// 3) Person 사용가능 단 Material클래스를 상속이 되었을때
		GenericPrinter<Person> personPrinter = new GenericPrinter<Person>();

		// 4)Material 사용가능
		GenericPrinter<Material> materialPrinter = new GenericPrinter<Material>();

	}

}
