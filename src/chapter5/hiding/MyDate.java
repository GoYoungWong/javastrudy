package chapter5.hiding;

// 접근자 - 4가지 유형
/* 
  private : 접근금지
  접근자 사용안함. default 동일 패키지에서는 public, 다른패키지에서는 private 
  public : 접근허용
  
  protected : 상속접근자.
  
  private < default < public
  default 필드는 동일한 패키지 일경우는 접근이되고, 다른 패키지에서는 접근이 안된다.
*/
public class MyDate {
	public int day;              // 아무것도 없으면(접근자 생략시) default이며 같은 패키지 내부에서만 접근가능
	int month;     // 외부 클래스 어디에서나 접근가능
	private int year;     // 같은 클래스 내부에서만 접근가능
}
