package chapter4.ifexample;


public class SwitchCase2 {

	public static void main(String[] args) {
		
		// String 클래스 : 문자열데이터를 관리할 때 사용.
		//char 데이타타입과는 다르다.
		String medal = "Gold";
		
		
		// switch문에 정수 변수만이 아니라 문자열 변수를 사용할수가 있다. (java 1.7버전에서부터 지원)
		switch(medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
		    break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이없습니다.");
			break;
		}
	}		
}
