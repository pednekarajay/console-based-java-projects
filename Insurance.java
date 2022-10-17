package lic;

public class Insurance {
	
	public String name;
	
	public int registerNo;
	
	public String dateOfBirth;
	
	public String address;
	
	int lifeInsurancePremium;
	int accidentalInsurancePremium;
	int medicalInsurancePremium;
	
	public Insurance(String name, int registerNo, String dateOfBirth, String address){
	    this.name = name;
	    this.registerNo = registerNo;
	    this.dateOfBirth = dateOfBirth;
	    this.address = address;
	}

}
