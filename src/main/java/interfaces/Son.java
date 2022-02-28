package main.java.interfaces;

interface Father{
	int mark = 15;
	void display();
}
interface Mother{
	int count = 3;
	void show();
}
public class Son implements Father, Mother {

	public static void main(String[] args) {
		Father fObj = new Son();
		Mother mObj = new Son();
		fObj.display();
		mObj.show();
		((Mother) fObj).show();
	}
	@Override
	public void show() {
		System.out.println("showing");
		
	}

	@Override
	public void display() {
		System.out.println("displaying");
		
	}

}
