package main.java.inheritance;

public class City extends Country {

	
	public static void cityPop(){
		System.out.println("child value");
	}
	
	public static void main(String[] args) {
		Country.cityPop();
		City.cityPop();
		Country con = new City();
		con.cityPop();
		Country con2 = null;
		con2.cityPop();
	}
}
