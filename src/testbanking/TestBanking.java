package testbanking;

import banking1.Account;
import banking1.Customer;

//import banking1.Account;

public class TestBanking {
	public static void main(String[] args) {
//		System.out.println("Creating an account with a 500.00 balance");
//		Account account = new Account(500.00);
//		System.out.println("Withdraw 150.00");
//		account.withdraw(150.00);
//		System.out.println("Deposit 22.50");
//		account.deposit(22.50);
//		System.out.println("Withdraw 47.62");
//		account.withdraw(47.62);
//		System.out.println("The account has a balance of " + account.getBalance());
		/*
		 * 测试
		 */
		System.out.println("Creating the customer Jane Smith");
		Customer customer = new Customer("Smith", "Jane");
		System.out.println("Create her account with 500.00 balance");
		customer.setAccount(new Account(500.00));
		System.out.print("Withdraw 150.00: ");
		System.out.println(customer.getAccount().withdraw(150.00));
		System.out.print("Deposit 22.50: ");
		System.out.println(customer.getAccount().deposit(22.50));
		System.out.print("Withdraw 47.62: ");
		System.out.println(customer.getAccount().withdraw(47.62));
		System.out.print("Withdraw 400.00: ");
		System.out.println(customer.getAccount().withdraw(400.00));
		System.out.print("Customer [" + customer.getFirstName() + "," + customer.getLastName() + "] has a balance of ");
		System.out.println(customer.getAccount().getBalance());
	}
}
