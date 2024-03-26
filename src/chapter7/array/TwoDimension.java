package chapter7.array;

// 다차원배열
public class TwoDimension {

	public static void main(String[] args) {
		
		// 2*3 : 2행3열
		int[][] arr = {
				      {1,2,3},
				      {4,5,6}
				      };
		
		// 두번째 행, 두번째 열의 데이타를 출력하라.
		System.out.println("두번째 행, 두번째 열? " + arr[1][1]);
		
		// 첫번째 행, 세번째 열 3을 30으로 변경하라.		
		arr[0][2] = 30;
		System.out.println("첫번째 행, 세번째 열? " + arr[0][2]);
		
		// 행의 크기
		System.out.println("arr 배열의 몇행? " + arr.length); // 2
		System.out.println("첫번쨰 행의 열의 개수? " + arr[0].length); // 3
		System.out.println("두번쨰 행의 열의 개수? " + arr[1].length); // 3
	
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	
	
	
	}

}
