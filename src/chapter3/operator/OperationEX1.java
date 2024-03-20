package chapter3.operator;

// 산술연산자 : +, -, *, /, %
public class OperationEX1 {

	public static void main(String[] args) {
		
		int mathscore = 90;
		int engscore = 75;
		
		int totalscore = mathscore + engscore;
		
		System.out.println(totalscore); // 165
		
		// totalscore / 2; 해석: int 형끼리 연산하면 결과는 int가된다.
		// double avgscore = totalscore / 2; 소수점까지 평균을 구하지 못한다.
		
		double avgscore = totalscore / 2.0; // 해석: (double)totalscore / 2.0; 
		System.out.println(avgscore); // 82.5
		
	}

}
