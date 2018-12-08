package testbanking;

import banking1.Bank;
import banking1.Customer;

public class TestBanking4 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("Simms", "Jane");
		bank.addCustomer("Bryant", "Owen");
		bank.addCustomer("Soley", "Tim");
		bank.addCustomer("Soley", "Maria");
		for (int i=0; i<bank.getNumOfCustomers(); i++){
			Customer customer = bank.getCustomer(i);
			System.out.println("Customer[" + (i+1) + "] is " + customer.getFirstName() + "," + customer.getLastName());
		}
	}
}
