package main.java.interfaces;

public class finalcalculator implements calculator {
	
	double doubleVar;

	@Override
	public double getDoubleVar() {
		return doubleVar;
	}
	
	@Override
	public void setDoubleVar(double doubleVar) {
		this.doubleVar = doubleVar;
	}

	public finalcalculator() {
	 super();
	 
	}

	@Override
	public void addition(int a,int b) {
//	this.doubleVar  = a + b;
	setDoubleVar(a+b);
	
	System.out.println(getDoubleVar());
	
	}

	@Override
	public void subtraction(int a,int b ) {
		setDoubleVar(a-b);
		
		System.out.println(getDoubleVar());
			
		
	}

	@Override
	public void divide(int a,int b) {
		setDoubleVar(a/b);
	    int abc = calculator.a;
		
		System.out.println(getDoubleVar());
		
		
	}

	@Override
	public void multiply(int a,int b) {
		
		setDoubleVar(a*b);
		
		System.out.println(getDoubleVar());
		
	}
	
	public static void main(String[]args){
		
		finalcalculator F = new finalcalculator();
		calculator cal = new finalcalculator();
		F.addition(10, 20);
		F.subtraction(20, 10);
		F.multiply(10, 20);
		F.divide(10, 2);
		System.out.println("int from inherited interface "+calculator.a);
		
	}

}
