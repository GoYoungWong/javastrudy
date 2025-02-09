package chapter14.generics2;

// 제네릭 기능이 있는 클래스
// <T>: 타입파라미터   이 클래스를 객체생성시 타입파라미터에는 참조타입만 사용가능
// extends Material 타입파라미터에 사용할수 있는 자료형을 제한
// 의미 : Material클래스또는 Material클래스를 상속받은 클래스만 타입파라미터로 사용가능. 
public class GenericPrinter<T extends Material> {
	
	private T material;
	
	//getter/setter메서드 작업
	
	public T getMaeterial() {
		return material;
	}
	
	public void setMaeterial(T maeterial) {
		this.material = maeterial;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
	
}
