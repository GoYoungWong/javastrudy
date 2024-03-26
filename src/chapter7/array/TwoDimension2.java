package chapter7.array;

public class TwoDimension2 {

	public static void main(String[] args) {
		
		// 배열도 객체다.
		// 배열변수에 주소값이 저장되어 있다.
		// 배열도 참조타입이다.
		// 마지막요소를 가리키는 이름은 3행2열 3-1, 2-1 고로 arr[2][1]
		int[][] arr = { 
				       {1,4},
				       {2,5},
				       {3,6}
		              };
		
		// 배열의 행크기?
		System.out.println("배열의 행크기? " + arr.length); // 3
		
		// 첫번째 행의 열의크기?
		System.out.println("첫번째 행의 열의크기? " + arr[0].length); // 2
		
		// 두번째 행의 열의크기?
		System.out.println("두번째 행의 열의크기? " + arr[1].length); // 2
		
		// 세번째 행의 열의크기?
		System.out.println("세번째 행의 열의크기? " + arr[2].length); // 2
		
		// 2행2열 데이타를 7로 변경하라.
		arr[1][1] = 7;
		
		// 3행2열 데이타를 8로 변경하라.
		arr[2][1] = 8;
		
		// 중첩 for문을 사용하여 2차원배열을 출력하자.
		
		for(int i=0; i<arr.length; i++) {    // 행 인덱스
			for(int j=0; j<arr[i].length; j++) {   // 열 인덱스
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		

	}

}
