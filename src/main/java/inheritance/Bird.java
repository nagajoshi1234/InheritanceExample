package main.java.inheritance;

public class Bird extends Animal {
	int age;
	String name = "himanshu";
	
	public Bird() {
		super(10,20);
//		this("amit");
//		super();
		System.out.println(super.name);	
		
		this.name = "sunil";
		System.out.println("A new bird has been created!");
	}
	
	public Bird(String nane){
//		super();
		this();
		
	}
	
	public Bird(int x) {
		this("am");
//		super(x,x);
	}
	
	@Override
	public void sleep() {
		String name = "himanshu123";
		this.age = 10;
		System.out.println("A bird sleeps...");
		
		super.sleep();
		System.out.println(super.name);	
	}

	
	public static void show() {
		System.out.println("showing bird");
	}
	
	@Override
	public void run(){
		System.out.println("running from bird");
	}
	
	@Override
	public void eat() {
		System.out.println("A bird eats...");
		this.run();
//		super.free();
		
	}
	
	
	
	public void free() {
		
	}

}
