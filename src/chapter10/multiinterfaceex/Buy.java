package chapter10.multiinterfaceex;

// 물건을 사다 : 인터페이스
public interface Buy {

	// 추상메서드
	void buy();
	
	// 일반메서드
	// 여기서만 작동하고 호출이 안됨
	default void order() {
		System.out.println("구매 주문");
	}
}
