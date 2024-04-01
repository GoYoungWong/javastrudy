package chapter14.generics3;

public class GenericMethod {

	// 제네릭 메서드 문법형식
	// <T, V> : 메서드 타입파라미터
	// static : 클래스명.메소드명
	// 제네릭메서드 호출 : GenericMethod.<integer, Double>makeRectangle(p1, p2);
	// 해석: public static <T,V> double makeRectangle(Point<integer,Double> p1, Point<integer,Double> p2) 주소가 복사됨
	// <T,V>타입파라미터랑 double리턴타입은 아무 상관없음
	// static <T,V> 여기 T,V는 데이터타입을 호출받는 용도임 호출을 받아서 p1,p2에있는 <T,V>가 변화함
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.gety()).doubleValue();
		double bottom = ((Number)p2.gety()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
		
	}
	
	public static void main(String[] args) {
		// 제네릭 메서드 호출
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		                                 // 생략가능
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
	    System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
 
		
		
		
		
		      // 이건 여기에 데이터타입이 다른게 들어갈수 있다는 예		
//		GenericMethod.<Long, Double>makeRectangle(null, null);
		
		

	
	}

}
