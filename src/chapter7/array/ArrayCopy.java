package chapter7.array;

//배열복사
public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] array1 = {10, 20, 30, 40, 50}; // 원본배열
		int[] array2 = {1, 2, 3, 4, 5}; // 사본배열
		
		// 배열복사
		// array1 배열에 인덱스 [0]위치에서 array2 배열의 인덱스 [1]위치에 4개를 복사한다.
		System.arraycopy(array1, 0, array2, 1, 4);
		
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
