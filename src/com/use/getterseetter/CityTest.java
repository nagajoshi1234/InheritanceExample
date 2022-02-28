package com.use.getterseetter;

public class CityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City cc = new City();
		cc.setName("Jaipur");
		cc.setNoOfSectors(15);
		cc.setNoOfTheatres(4);
		cc.setPopulation(5000000);
		cc.marketValue =10;
		System.out.println(cc.getName()+"    "+cc.getNoOfSectors()+"    "+cc.getNoOfTheatres()+"    "+cc.getPopulation());
		
		City cc1 = new City();
		cc1.setName("Raipur");
		cc1.setNoOfSectors(25);
		cc1.setNoOfTheatres(3);
		cc1.setPopulation(4000000);
		System.out.println(cc1.getName()+"    "+cc1.getNoOfSectors()+"    "+cc1.getNoOfTheatres()+"    "+cc1.getPopulation());
		System.out.println(cc1.marketValue);
		

	}

}
