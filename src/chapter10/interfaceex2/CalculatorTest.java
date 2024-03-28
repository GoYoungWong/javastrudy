package chapter10.interfaceex2;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteeCalc calc = new CompleteeCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		// 디폴트 메서드 호출
		calc.description();
		
		// 추상메서드 호출
		Calc.myStaticMethod();
		
		// 상수 접근
		System.out.println(CompleteeCalc.PI);
		System.out.println(CompleteeCalc.ERROR);
	
	}

}
