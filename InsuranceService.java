package lic;
import java.util.*;

public class InsuranceService {
	
	int lifeInsurancePremium;
	int accidentalInsurancePremium;
	int medicalInsurancePremium;
	
	List<Insurance> insurances = new LinkedList<Insurance>();
	Scanner s = new Scanner(System.in);

	//method to create new customers
	   public void createCustomers()
			{
				System.out.println("Enter the Name of the Customer: ");
				String name = s.next();
				System.out.println("Enter the Register number of Customer: ");
				int registerNo = s.nextInt();
				System.out.println("Enter the Date of Birth of Customer: ");
				String dateOfBirth = s.next();
				System.out.println("Enter the Address of Customer: ");
				String address = s.next();
				Insurance insurance = new Insurance(name, registerNo, dateOfBirth, address);
				insurances.add(insurance);
		
	}
	
	//method to display customer details
	    public void displayCustomers()
     	{
			    System.out.println("Enter Register No: ");
				int registerNo = s.nextInt();
				Insurance insurance = search(registerNo);
	    		System.out.println("Register Number: " + insurance.registerNo);
	    		System.out.println("Name of Customer: " + insurance.name);
	    		System.out.println("Date of Birth: " + insurance.dateOfBirth);
	    		System.out.println("Address: " + insurance.address);
	    		System.out.println("Life Insurance: " + insurance.lifeInsurancePremium);
	    		System.out.println("Accidental Insurance: " + insurance.accidentalInsurancePremium);
	    		System.out.println("Medical Insurance: " + insurance.medicalInsurancePremium);
			
	}
	
	//method to display all Customer details
		public void displayAllCustomers()
		{
		    for(Insurance insurance : insurances){
	    		System.out.println("Register Number: " + insurance.registerNo);
	    		System.out.println("Name of Customer: " + insurance.name);
	    		System.out.println("Date of Birth: " + insurance.dateOfBirth);
	    		System.out.println("Address: " + insurance.address);
	    		System.out.println("Life Insurance: " + insurance.lifeInsurancePremium);
	    		System.out.println("Accidental Insurance: " + insurance.accidentalInsurancePremium);
	    		System.out.println("Medical Insurance: " + insurance.medicalInsurancePremium);
		    }
		}
		
	//method to buy insurance
		public void buyInsurance()
			{
				System.out.println("Enter the Register number: ");
				int registerNo = s.nextInt();
				Insurance insurance = search(registerNo);
				if(insurance!=null){
					
				System.out.println("Types of Insurences");
				
				System.out.println("1. Life Insurance Premium Rs. 10000 p.a. Sum Insured Rs. 25 lacs"
						+ "\n2. Accidental Insurance Premium Rs. 3000/ p.a. Insured Sum Rs. 5 lacs"
						+ "\n3. Medical Insurance Premium Rs. 2000/ p.a. Insured Sum Rs. 1 lac");
				
				System.out.println("Enter your choice: ");
				int ch = s.nextInt();
					switch(ch)
				{
				case 1:
					 lifeInsurancePremium =+ 10000;
					 System.out.println("Life Insurance Added Successfully!");
					 break;
				case 2:
					 accidentalInsurancePremium =+ 3000;
					 System.out.println("Accidental Insurance Added Successfully!");
					 break;
				case 3:
					 medicalInsurancePremium =+ 2000;
					 System.out.println("Medical Insurance Added Successfully!");
					 break;
				}
				}else {
				    System.out.println("Search failed! Customer doesn't exist..");
	
				}
			}
			
	//method to display all the premiums received by the company
		public void displayTotalPremium()
				{
					int totalPremium = lifeInsurancePremium + accidentalInsurancePremium + medicalInsurancePremium;
					System.out.println("Total premium received by the company: " + totalPremium);
		
				}
				
		//method to search register Number
		public Insurance search(int registerNo)
				{
				    for(Insurance insurance : insurances){
				        if(insurance.registerNo == registerNo)
			    		{
			    			return insurance;
			    		}
				    }
				    
				    return null;
				}
		
	}
