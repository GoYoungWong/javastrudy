package chapter15.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// 스트림 예제 : 컬렉션에 스트림기능을 사용.
// 컬렉션 : 데이터가 추가 될때마다 기억장소가 확장되서 집어넣는다.
// 추가, 읽기, 제거 메서드
public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		// List컬렉션                 // 구현클래스객체
		List<String> sList = new ArrayList<String>();
		sList.add("손흥민");
		sList.add("김민재");
		sList.add("이강인");
		
		//일반for문 ArrayList클래스는 컬렉션형태의 기억장소를 0,1 인덱스형태로 관리.
		for(int i=0; i < sList.size(); i++) {
			// 정렬작업
			// if문으로 작업
			// for문으로 대소비교시, 작업하면 작업량이 많아짐
			System.out.println(sList.get(i));
		}
		System.out.println();
		
		//향상된 for문
//		for( 변수선언 :배열또는컬렉션)
		for( String s : sList ) {
			System.out.println(s);
		}
		System.out.println();
		
		// 스트림 사용
		// 1)컬렉션객체의 데이터를 순차적으로 출력
		// 스트림에서 제공하는 메서드를 사용하면 jdk에서 제공하는 함수형인터페이스가 있다.
		// forEach(Consumer 함수형인터페이스)
		// Consumer : 매개변수를 사용만하고 리턴을 하지 않는 함수형태로 이용
		// https://inpa.tistory.com/entry/%E2%98%95-%ED%95%A8%EC%88%98%ED%98%95-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4-API
		Stream<String> stream = sList.stream(); // 컬렉션객체.stream()
		
		// for문과 동일
		stream.forEach(s -> System.out.println(s + " "));
		
		System.out.println();
		
		// 2)컬렉션 객체의 데이터를 정렬. sorted() 메서드 지원되지 않으면, for문안에서 데이터를 대소비교하여, 정렬코드작업 해야만 한다.
		sList.stream().sorted().forEach(s -> System.out.println(s + " "));
	}

}
