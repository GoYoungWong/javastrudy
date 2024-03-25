package chapter7.array;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 : 동일한 데이타타입으로 연속된 기억장소를 하나의 대표이름으로 관리하는 기능
		/*
		 - 기본데이타타입으로 생성하는 배열 
		 기본데이타타입[] 배열이름 = new 기본데이타타입[] {값1, 값2, 값3, 값4, 값5, 값6};
		  */
		
		// int형 배열을 생성하면, 초기값 사용.
		// int[] : 하나의 의미로 봄.
		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	
		// 인덱스가 5인 배열요소를 60으로 변경하라.
		number[5] = 60;
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
