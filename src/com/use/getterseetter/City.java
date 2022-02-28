package com.use.getterseetter;
public class City {
	
	private String name;
	private int noOfSectors;
	private long population;
	private int noOfTheatres;
	
	public static int marketValue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfSectors() {
		return noOfSectors;
	}

	public void setNoOfSectors(int noOfSectors) {
		this.noOfSectors = noOfSectors;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public int getNoOfTheatres() {
		return noOfTheatres;
	}

	public void setNoOfTheatres(int noOfTheatres) {
		this.noOfTheatres = noOfTheatres;
	}	
}

