package chapter7.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
	
	//double 형 배열. 초기값은 0.0
	// [5] : 첨자. 배열의 크기를 나타냄
	double[] data = new double[5];
	
	// 값을 변경
	data[0] = 10.0;
	data[1] = 20.0;
	data[2] = 30.0;
	
	for(int i=0; i < data.length; i++) {
		System.out.println(data[i]);
	}
  }
}