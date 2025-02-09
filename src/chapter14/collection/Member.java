package chapter14.collection;

public class Member /* extends Object */{
	
	private int memberid;
	private String memberName;
	
	// 매개변수가 있는 생성자
	// super(); 생략해도 컴파일 과정에서 자동생성. Object클래스의 기본생성자 호출
	public Member(int memberid, String memberName) {
		super();
		this.memberid = memberid;
		this.memberName = memberName;
	}
	
	// getter or setter 메서드    private(접근금지) 이 있는 필드를 읽어 오기 위하여 작성
	public int getMemberid() {
		return memberid;
	}
	
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	// Member들의 정보를 확인하기 위해 작성
	// 재정의 목적? 클래스의 필드내용 확인.
	@Override
	public String toString() {
		return "[member=" + memberid + ", memberName=" + memberName + "]";
	}


	
	

	
}
