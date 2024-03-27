package chapter9.abstractex;

public class Lion extends Animal{

	@Override
	void run() {
		System.out.println("사자가 달린다.");
		
	}

	@Override
	void cry() {
		System.out.println("사자가 울부 짖다.");
		
	}

}
