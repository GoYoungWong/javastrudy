package chapter9.abstractex;

public class Tiger extends Animal{

	@Override
	void run() {
		System.out.println("호랑이가 달린다.");
		
	}

	@Override
	void cry() {
		System.out.println("호랑이가 울부짖다.");
		
	}

}
