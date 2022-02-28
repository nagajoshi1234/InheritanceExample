package com.encapsulation;

public class Humans {
	private String categorymf;
	private int noOfbodyparts;
	private int noOfFaceFeatures;
	private double weight;
	private double bp;
	
	public String getCategorymf() {
		Humans hum = new Humans();
		hum.categorymf = "sunder";
		return categorymf;
	}
	public void setCategorymf(String categorymf) {
		this.categorymf = categorymf;
	}
	public int getNoOfbodyparts() {
		return noOfbodyparts;
	}
	public void setNoOfbodyparts(int noOfbodyparts) {
		this.noOfbodyparts = noOfbodyparts;
	}
	public int getNoOfFaceFeatures() {
		return noOfFaceFeatures;
	}
	public void setNoOfFaceFeatures(int noOfFaceFeatures) {
		this.noOfFaceFeatures = noOfFaceFeatures;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBp() {
		return bp;
	}
	public void setBp(double bp) {
		this.bp = bp;
	}
	
	public void printAll(){
		System.out.println(categorymf+"    "+noOfbodyparts+"    "+noOfFaceFeatures);
	}
	
	

}
