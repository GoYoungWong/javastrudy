package chapter15.Lambda;

// 구현클래스 
// implements 구현
public class StringConCatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
	}

}
