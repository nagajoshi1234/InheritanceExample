package main.java.inheritance;

public class TestingLed {

	public static void main(String[] args) {

		Led obj1 = new LedTest();
		((LedTest) obj1).setValues("bajaj",50,10);
		Led obj2 = new LedTest();
		((LedTest) obj2).setValues("philips",60,17);
		obj1.printAll();
		obj2.printAll();
	}

}
