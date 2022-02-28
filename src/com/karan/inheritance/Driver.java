package com.karan.inheritance;


public class Driver 
{
	public static void main(String[] args) {
	int pop;
	int state;
		
	NorthAmerica northamerica=new NorthAmerica();
	America america=new America();
	
	northamerica.oceans();
	northamerica.lakes();
	
	System.out.println("\nthe biggest state in us is");
	america.biggeststate();
	System.out.println("\nPopulation of us is");
	pop=america.population();
	state=america.states();
	System.out.println(pop);
	System.out.println("\nnumber of states in us is");
	System.out.println(state);
	
	Minnesota mn=new Minnesota();
	
	mn.cities();
	mn.lakes();
	
	
	}
	
}
