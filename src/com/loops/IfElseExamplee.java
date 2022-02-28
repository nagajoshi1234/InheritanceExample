package com.loops;

public class IfElseExamplee { // class

	String comp;  // variable
	
	public IfElseExamplee(String comp) {
		this.comp = comp;
	}
	
	public String getComp(){
		return comp;
	}
	
	public String compareStrings(String abc){
		if(abc.equals("Windows")){
			System.out.println("System is win");	
		}
		else{
			System.out.println("get out");
			
		}	
		return comp;
	}
	
	public static void main(String[] args) {
//		String comp ="Windows";
		IfElseExamplee ex = new IfElseExamplee("Mac");
		String newSt = ex.compareStrings(ex.getComp());
		System.out.println("system is "+newSt);
		if(!newSt.equals("win")){
			System.out.println("kkkkkkkkk");
			if(!newSt.equals("Win")){
				System.out.println("not equals");
			}
			else{
				
			}
		}
		else if(newSt.equals("Mac"))
			System.out.println("eqquals");
		else{
			
		}
	}
	
}
