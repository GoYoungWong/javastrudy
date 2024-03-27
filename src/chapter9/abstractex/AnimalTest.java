package chapter9.abstractex;

// Anonymous Inner type
public class AnimalTest {

	public static void main(String[] args) {
		// Animal추상클래스를 객체생성 할수없도록 설계되어있다. 할려고 하면 이거나옴 Anonymous Inner type 쓰지마
		// Animal animal = new Animal(); 에러발생 

		AnimalTest aTest = new AnimalTest();
		aTest.callMethodAnimal(new Cat());
		aTest.callMethodAnimal(new Dog());
		aTest.callMethodAnimal(new Lion());
		aTest.callMethodAnimal(new Tiger());
	}
	// 다형성
	public void callMethodAnimal(Animal animal) {
		animal.cry();
		animal.run();
	}
}
