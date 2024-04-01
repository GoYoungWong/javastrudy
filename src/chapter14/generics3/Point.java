package chapter14.generics3;

// 멀티타입파라미터
public class Point <T, V> {
	
	// 필드
	T x;
	V y;
	
	// 생성자
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	// 제네릭 메서드
	public T getX() {
		return x;
	}
	
	public V gety() {
		return y;
	}
	
	// 제네릭클래스 객체생성
	/*
	 Point<integer, Double> p1 = new Point<integer, Double>(0,0,0);
	 Point<integer, Double> p1 = new Point<생략가능>(10,10,0);
	 */

}
