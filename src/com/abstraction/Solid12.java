package com.abstraction;

import main.java.interfaces.BasketballTeam1;

public class Solid12 extends MySecondClass implements BasketballTeam1{

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		
	}
	
	public void run() {
		
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		double y = Math.random();
		System.out.println(y);
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printBasketballName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String nname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		BasketballTeam1 bt = new Solid12();
		((Solid12) bt).operate();
		((Solid12) bt).division();
	}

	

}
