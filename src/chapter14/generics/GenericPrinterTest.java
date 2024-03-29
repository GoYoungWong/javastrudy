package chapter14.generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// 제네릭 클래스를 사용. 객체생성
//		GenericPrinter<참조타입>
		// 밑에 처럼 코드를 작성하면 T가 전부 Power로 바뀜
		GenericPrinter<Power> PowerPrinter = new GenericPrinter<Power>();
		
		PowerPrinter.setMaeterial(new Power());
		Power power = PowerPrinter.getMaeterial();
		System.out.println(PowerPrinter);
		
		// 밑에 처럼 코드를 작성하면 T가 전부 Plastic로 바뀜
		GenericPrinter<Plastic> PlasticPrinter = new GenericPrinter<Plastic>();
		
		PlasticPrinter.setMaeterial(new Plastic());
		Plastic plastic = PlasticPrinter.getMaeterial();
		System.out.println(PlasticPrinter);
	}

}
