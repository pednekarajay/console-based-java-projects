package lic;
import java.util.Scanner;

public class InsuranceApplication {
	
	public static void main(String[] args) {

	InsuranceService insuranceService = new InsuranceService();
	Scanner s = new Scanner(System.in);
	
			//create initial accounts
			System.out.println("Enter the No of customers: ");
			int n = s.nextInt();
			for(int i =0; i < n; i++)
			{
				insuranceService.createCustomers();
			}
			
			//loop runs until number 5 is not pressed to exit
	
			int choice;
			do{
				System.out.println("\n----Insurance Application----");
				
				System.out.println("1.Display all customers details\n2.Search by register number\n3.Buy Insurance"+
						                   "\n4.Display Total Premiums received by the Company\n5.Exit");
				
				System.out.println("Enter your choice: ");
				choice = s.nextInt();
				switch(choice)
				{
				case 1:
					insuranceService.displayAllCustomers();
					break;
				case 2:
					insuranceService.displayCustomers();
					break;
				case 3:
					insuranceService.buyInsurance();
					break;
				case 4:
					insuranceService.displayTotalPremium();
					break;
				case 5:
					System.out.println("Thank You!!!");
					break;
					}
				
			}
			while(choice != 6);
		}

}
