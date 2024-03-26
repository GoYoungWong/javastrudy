package chapter7.array;

// 향상된 for문과 배열
public class EnhancedForLoop {

	public static void main(String[] args) {
		
		// 문자열배열
		String[] strArray = {"인공러닝", "머신러닝", "딥러닝"};
		
		// 전통적인 for문
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		// 향상된 for문
		for(String ai : strArray) {
			System.out.println(ai);
		}
	}

}
