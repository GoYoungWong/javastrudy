package chapter14.collection.map.hashmap;

import java.util.HashMap;

// Map 인터페이스를 구현한 HashMap클래스 예제.
// Key 와 value 쌍으로 된 구조를 갖고있다. 이 구조를 Entry 라고 부른다.
public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// 값을 저장할때는 put
		// Key는 중복되면 않된다. value는 중복이 가능하다.
		map.put("가", 1);
		map.put("나", 2);
		map.put("다", 3);
		map.put("라", 4);
		map.put("마", 5);
		
		// 값을 출력할땐 get
		System.out.println(map.get("가")); // 1
		
		

	}

}
