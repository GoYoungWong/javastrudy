package chapter14.collection;
/*import java.util.Comparator;*/


// TreeSetTest클래스에서 이 클래스가 객체생성하여, 데이터로 사용하기위하여,
// 아래 인터페이스를 반드시 구현해야 한다.
// 1)Comparable인터페이스 또는 2)Comparator인터페이스를 구현해야 한다.
public class Member2 implements Comparable<Member2>{
	
	private int memberid;
	private String memberName;
	
	// 매개변수가 있는 생성자
	// super(); 생략해도 컴파일 과정에서 자동생성. Object클래스의 기본생성자 호출
	public Member2(int memberid, String memberName) {
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
	
	// 객체비교로 사용되는 메서드 재정의
	@Override
	public int hashCode() {
		return memberid;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2) obj;
			if(this.memberid == member.memberid && this.memberName.equals(member.memberName))
				return true;
			else
				return false;
		}
		return false;
	}
// 객체가 대소비교에 사용되는 추상메서드 구현용도.
	// Member2 o1 :기준   Member2 o2 : 데이터
	/*@Override
	public int compare(Member2 o1, Member2 o2) {
		System.out.println("Compare호출");
		// Member2클래스를 대소비교할 떄 기준을 잡아야 한다.
		// MemberID를 대소비교 대상으로 기준을 잡음.
		return o1.getMemberid() - o2.getMemberid();
	}*/

@Override
public int compareTo(Member2 o) {
	System.out.println("compareTo호출");
	
//	System.out.println(memberid - o.getMemberid());
	
	// 오름차순 1001 1002 순서로 저장
	/*return this.memberid - o.getMemberid();*/
	
	// 내림차순  1002 1001 순서로 저장
	return (this.memberid - o.memberid) * (-1);
}


	
}
