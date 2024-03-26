package chapter8.inheritance;
                       
public class VIPCustomer extends Customer {
	
	// 상속
	
	// 추가
	private int agentID; // 담담 상담원ID
	double saleRatio; // 할인율
	
	// 생성자
	public VIPCustomer() {
		
		// 상속
		customerGrade = "VIP";
		bonusRatio = 0.05;
		
		// 자신
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	
	// 매개변수가 있는 생성자.
	// super : 상속관계에서 부모(상위)클래스를 가르키는 의미.
	public VIPCustomer(int customerID, String customerName, int agentID) {
		// 부모의 매개변수가 있는 생성자 호출
		super(customerID,customerName);
		
		// 부모상속
		customerGrade = "VIP";
		bonusRatio = 0.05;
		
		// 자신
		saleRatio = 0.1;
		this.agentID = agentID;
		
		System.out.println("VIPCustomer(int, String, int)생성자 호출");
	}

    // 부모클레스의 메서드이름만 사용하고 내용은 변경해서 작업하고자 할떄 
	// 메서드재정의(overriding)
	// @Override : 이 메서드는 재정의 됬다는 의미
    @Override
	public int calcPrice(int Price) {
		System.out.println("VIPCustomer.calcPrice");
		bonusPint += Price * bonusRatio;
		return Price - (int)(Price * saleRatio);
	}
    // private int agentID; getter메서드
    public int getAgentID() {
    	return agentID;
    }
    
    
}
