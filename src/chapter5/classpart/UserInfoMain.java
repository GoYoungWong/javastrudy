package chapter5.classpart;

public class UserInfoMain {

	public static void main(String[] args) {
		
		// 객체생성
		UserInfo user1 = new UserInfo();
		
		// 회원가입페이지로 사용자데이타를 입력받아 UserInfo클래스의 객체가 사용된다.
		// 스프링을 통하여, 객체가 가지고 있는 데이터를 타이타베이스 저장하게 된다.
		
		user1.name = "스프링이해줄꺼임";
		user1.userid = "스프링이해줄꺼임";
		user1.passwd = "스프링이해줄꺼임";
		user1.virth = "스프링이해줄꺼임";
		user1.email = "스프링이해줄꺼임";
		user1.tel = "스프링이해줄꺼임";
		user1.zipcode = "스프링이해줄꺼임";
		user1.addr = "스프링이해줄꺼임";
		
	}

}
