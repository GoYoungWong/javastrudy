package chapter15.stream;

import java.util.Arrays;

// Stream클래스의 reduce()메서드 사용하기
// 개발자가 기능을 직접구현작업.                           

// 배열을 스트림클래스 사용하기
// 사용법 : Arrays.stream(배열). / 컬렉션객체.stream()
// reduce()메서드: 컬렉션의 요소들의 값을 비교하고자 할때 사용.
public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"안녕하살법~~", "hello", "Good Morning","반갑하살법."};
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2) -> {
			// 람다식 문법
			System.out.println("데이터: " + s1);
			System.out.println("데이터: " + s2);
			
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));

	}

}
