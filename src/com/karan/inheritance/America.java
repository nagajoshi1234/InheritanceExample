package com.karan.inheritance;

public class America extends NorthAmerica
{
	public America() {

	}


	int states;
	int pop;
	
	public int states()
	{
		states=50;
		return states;
	}
	
	
	public int population()
	{
		pop=327000000;
		return pop;
	}
	
	public void biggeststate()
	{
		System.out.println("Alaska");
	}
	
	
	public void minnesota()
	{
		System.out.println("minnesota is a state");
	}
	
	
	
}
