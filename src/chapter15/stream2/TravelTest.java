package chapter15.stream2;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		// 객체이름. 이름 나이 여행비용
		// customerLee "이순신",40,100
		// customerKim "김유신",20,80
		// customerHong "홍길동",13,50
		
		TravelCustomer cusotmerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer cusotmerKim = new TravelCustomer("김유신", 20, 80);
		TravelCustomer cusotmerHong = new TravelCustomer("홍길동", 13, 50);
		
		// List 컬렉션 ArrayListcustomer 사용 customerList 이름으로 위의 객체를 3개추가 작성
		// cusotmerList 여기에 Lee, Kim, Hong 에 있는 주소가 저장된다.
		List<TravelCustomer> cusotmerList = new ArrayList<TravelCustomer>();
		cusotmerList.add(cusotmerLee);
		cusotmerList.add(cusotmerKim);
		cusotmerList.add(cusotmerHong);
		
		System.out.println("--- 고객명단 추가된 순서대로 출력 ===");
		//  c : 매개변수 어떤거든 상관없음 예> a,b,c,d,f
		// map() : 객체의 일부를 참조할 때 사용. 예> 이름,나이,여행비용 -> 이름만 사용 -> map() 사용
		cusotmerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		System.out.println("--- 고객나이를 추가된 순서대로 출력 ===");
		cusotmerList.stream().map(c-> c.getAge()).forEach(age -> System.out.println(age));
		
		System.out.println("--- 고객여행비용을 추가된 순서대로 출력 ===");
		cusotmerList.stream().map(p -> p.getPrice()).forEach(p -> System.out.println(p));
		
		// 총 여행비용(100, 80, 50) = 230
		// mapToInt : 사용하려는 데이터가 int형 이라서
		// smu() : 더하기
		System.out.println("--- 고객 총여행비용을 출력 ===");
		int total_price = cusotmerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행비용: " + total_price); // 230
		
		System.out.println("--- 나이가 20세이상인 고객명단을 정렬하여 출력 ===");
		// 조건을 이용할 때 Stream API 작업.
		// sorted() : 정렬
		cusotmerList.stream().filter(c -> c.getAge() >= 20).map(n -> n.getName()).sorted().forEach(s -> System.out.println(s));

	}

}
