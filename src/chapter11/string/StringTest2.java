package chapter11.string;

// 문자열 데이타끼리 결합(연결)을 하면, 새로운 기억장소로 관리가 된다.
public class StringTest2 {

	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr); // java
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(javaStr)); // 처음 문자열 주소값: 515132998

		// 문자열 + 문자열
		// "javaandroid" 새로운 문자열로 기억장소 새로 생성된다.
		javaStr = javaStr.concat(androidStr); // "java" + "android" = javaandroid
		
		System.out.println(javaStr); // javaandroid
		System.out.println("연결된 문자열 주소값: " + System.identityHashCode(javaStr)); // 연결된 문자열 주소값: 242131142
	
		System.out.println(javaStr.toLowerCase()); // 소문자로 바꾸기 = javaandroid
		System.out.println(javaStr.toUpperCase()); // 대문자로 바꾸기 = JAVAANDROID
	
	
	}

}
