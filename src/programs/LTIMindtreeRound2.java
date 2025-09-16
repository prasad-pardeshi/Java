package programs;

class Test {
	static void myMythod() {
		System.out.println("LearnToTest");
	}
}

class Derived extends Test {
	void myMethod() {
		
		System.out.println("SF");
	}
}

public class LTIMindtreeRound2 {
	public static void main(String[] args) {
		Derived object = new Derived();
		object.myMethod();
		Test.myMythod();
	}
}