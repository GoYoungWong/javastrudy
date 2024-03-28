package chapter10.multiinterfaceex;

// 물건을 팔다 : 인터페이스
public interface Sell {

	// 추상메서드
	void sell();
	
	// 일반메서드
	// 여기서만 작동하고 호출이 안됨
	default void order() {
		System.out.println("판매 주문");
	}
}
