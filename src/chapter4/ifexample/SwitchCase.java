package chapter4.ifexample;

// 선택문 : 다중if문과 유사
public class SwitchCase {

	public static void main(String[] args) {
		
		int ranking = 1; // 1, 2, 3, 기타 이외의 값
		char medaColor;
		
		switch(ranking) {
			case 1: medaColor = 'G'; // Gold
				break;
			case 2: medaColor = 'S'; // Silver
				break;
			case 3: medaColor = 'B'; // Blons
				break;
			default: // if문의 else 와 유사하다.
				medaColor = 'A';
		}	
		
		System.out.println(ranking + "등 메달의 색깔은? " + medaColor + "입니다.");

	}

}
