package main.java.inheritance;

public class LedTest extends Led {

	public void setValues(String cn, double size, double watt){
		this.setCompanyName(cn);
		this.setSize(size);
		super.setWattage(watt);
	}
}

