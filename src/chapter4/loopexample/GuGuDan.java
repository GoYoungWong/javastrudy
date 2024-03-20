package chapter4.loopexample;

// 중첩for문을 이용해 구구단 만들기
public class GuGuDan {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 9; i++) { // 곱해지는 값
			for(int j = 2; j <= 9; j++) { // 단
				if(i == 0 ) { 
					System.out.print(j + "단" + "\t");
					continue;
				}
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			System.out.println();
		}

	}

}
