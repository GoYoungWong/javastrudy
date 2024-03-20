package chapter4.ifexample;

// switch 문을 다중if문으로 변경
public class Switch_If_convert {

	public static void main(String[] args) {
		int ranking = 1; // 1, 2, 3, 기타 이외의 값
		char medaColor;
		
		if(ranking == 1) {
			medaColor = 'G';
		}else if(ranking == 2) {
			medaColor = 'S';
		}else if(ranking == 3) {
			medaColor = 'B';
		}else {
			medaColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은? " + medaColor + "입니다.");
	}

}
