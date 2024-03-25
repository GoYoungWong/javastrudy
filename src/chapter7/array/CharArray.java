package chapter7.array;

public class CharArray {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'A'; // 코드값 65로 저장되어있음.
		
		for(int i=0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch; // ch변수에 +1 반영이 되어있다.
			
		}
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int) alphabets[i]);
		}
	}

}
