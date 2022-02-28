package main.java.inheritance;

public class MainClass {
	public static void main(String[] args) {
		Animal an = new Animal();
		Bird bb = new Bird();
		Dog dd = new Dog();
		Bird b2 = new Bird(10);
		Animal.show();
		Bird.show();
//		bird.print2();
		
//		System.out.print("ddd");
//		System.out.print("lll");
		System.out.println();
		
		
		an.sleep();
		an.eat();
		
		bb.sleep();
		bb.eat();
		
		dd.sleep();
		dd.eat();
		dd.runFast();
		
		System.out.println("\n");
		System.out.println();
		
		Animal a1 = new Dog();  //upcasting
		Animal a2 = new Bird();
		
		a1.eat();	//DMD
		a2.sleep();
		a1.run();
		((Dog) a1).runFast();  //class casting
		
		System.out.println(a1.val);
		System.out.println(((Dog)a1).getVal());
		a2.show();  		//Animal.show()
		System.out.println("referene variable "+a2.name);
//		System.out.println(((Dog) a1).getVal());
		// The following statements are incorrect.
//		 Dog d = new Animal();
//		 Bird b = new Animal();
		
		boolean flag = a1 instanceof Animal;
		System.out.println(flag);
		System.out.println(dd instanceof Animal);
		System.out.println(bb instanceof Animal);
		System.out.println(bb instanceof Dog);		
	}
}
