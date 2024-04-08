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
		
		// 위에 String배열을 대상으로 Stream API 작업을 할 경우에는 Arrays.stream(String배열)
		
		
                                                      // "" -> s1 ,  배열 첫번째 값 -> s2		
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2) -> {
			
			/*
			 s1 매개변수에 "" 대입이 되고, s2매개변수 "안녕하세요~~" 대입이 된다.
			 
			 s1의 바이트 길이와 s2의 바이트길이를 if문에서 대소비교, 큰길이의 문자열을 s1에 저장하고
			 s2에는 2번째 문자열("hello")을 대입한다.
			 
			 그리고 다시 바이트 길이 대소비교를 반복한다
			 */
			
			// 람다식 문법
			/*
			System.out.println("데이터: " + s1);
			System.out.println("데이터: " + s2);
			
			System.out.println("s1: " + s1.getBytes().length);
			System.out.println("s2: " + s2.getBytes().length);
			*/
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));

	}

}
