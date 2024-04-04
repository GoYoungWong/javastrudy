package chapter15.lambda;

// 함수형 인터페이스 : 추상메서드 단 1개를 가지고 있는 인터페이스

// @FunctionalInterface : 컴파일 과정에서 이 인터페이스가 함수인터페이스 라는것을 알리기 위해 작성
// @FunctionalInterface : 인터페이스가 추상메서드 단 1개 일 경우에만 사용가능.
@FunctionalInterface // @이름 : Annotation
public interface MyNumber {

	// 추상메서드
	int getMax(int num1, int num2);
	
	// 함수형 인터페이스에 추상메서드 추가시 오류발생
	// @FunctionalInterface 이걸 지우던가
	// 추가된 추상메서드를 지운다.
//	int sum(int a, int b);
}
