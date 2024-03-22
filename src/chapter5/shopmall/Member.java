package chapter5.shopmall;

// 회원
public class Member {
	
	// 저장하고자 하는 데이터를 예상하고 타입을 정한다.
	String name; // 이름
	String id; // 아이디
	String pwd; // 비밀번호
	int age; // 나이
	char gender; // 성별  M:남자  F:여자 
	String zipcode; //우편번호
	String addre; // 주소
	String hobby; // 취미
	
	void register(String nmae, String id, String pwd, int age, char gender, String zipcode, String addr, String hobby) {
	
		// 데이타베이스에 회원정보를 삽입하는 구문
	}
	
	void edit(String nmae, String id, String pwd, int age, char gender, String zipcode, String addr, String hobby) {
		
		// 데이타베이스에 회원정보를 수정하는 구문
	}
	
	void delete(String id, String pwd) {
		
		// 데이타베이스에 회원정보를 삭제하는 구문
		
	}
	
	boolean login(String id, String pwd) {
		
		// 데이타베이스에 아이디, 비밀번호 존재유무체크 해서 존재하면 true, 존재하지 않은면 false
		
		return true;
	}
	
	// 아이디 중복체크
	boolean idCheck(String id) {
		
		// 데이타베이스에 아이디가 존재하지않으면 사용가능 true, 아이디가 존재하면 사용불가능 false
		
		return true;
	}
	
}
