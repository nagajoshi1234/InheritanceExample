package main.java.inheritance;

public class Led {
	String companyName;
	double wattage;
	double size;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getWattage() {
		return wattage;
	}
	public void setWattage(double wattage) {
		this.wattage = wattage;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	public void printAll(){
		System.out.println(companyName+" "+wattage+" "+size);
	}

}
