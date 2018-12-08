package testbanking;

import banking1.Account;
import banking1.Bank;
import banking1.CheckingAccount;
import banking1.Customer;
import banking1.SavingAccount;

public class TestBanking5 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer;
		Account account;
		System.out.println("Creating the customer Jane Smith");
		bank.addCustomer("Jane", "Smith");
		System.out.println("Creating his Savinging Account with a 500.00 balance and 3% interest");
		customer = bank.getCustomer(0);
	    account = new SavingAccount(500.00, 0.03);
		customer.setAccount(account);
		System.out.println("Creating the customer Owen Bryant");
		bank.addCustomer("Owen", "Bryant");
		System.out.println("Creating his Checking Account with a 500.00 balance and no overdraft protection");
		customer = bank.getCustomer(1);
		account = new CheckingAccount(500.00);
		customer.setAccount(account);
		System.out.println("Creating the customer Tim Soley");
		bank.addCustomer("Tim", "Soley");
		System.out.println("Creating his checking Account with a 500.00 balance and 500.00 in overdraft protection.");
		customer = bank.getCustomer(2);
		account = new CheckingAccount(500.00, 500.00);
		customer.setAccount(account);
		System.out.println("Creating the customer Maria Soley");
		bank.addCustomer("Maria", "Soley");
		System.out.println("Maria shares her Checking Account with her huaband Tim");
		customer = bank.getCustomer(3);
		customer.setAccount(bank.getCustomer(2).getAccount());
		System.out.println();
		
		System.out.println("Retrieving the customer Jane Smith with her Saving account");
		customer = bank.getCustomer(0);
		account = customer.getAccount();
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		System.out.println("Customer [" + customer.getLastName() + "," + customer.getFirstName() + "] has a balance of " + account.getBalance());
		System.out.println();
		
		System.out.println("Retrieving the customer Owen Bryant with his Checking account with no overdraft protection.");
		customer = bank.getCustomer(1);
		account = customer.getAccount();
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		System.out.println("Customer [" + customer.getLastName() + "," + customer.getFirstName() + "] has a balance of " + account.getBalance());
		System.out.println();
		
		System.out.println("Retrieving the customer Tim Soley with his Checking account that has overdraft protection.");
		customer = bank.getCustomer(2);
		account = customer.getAccount();
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		System.out.println("Customer [" + customer.getLastName() + "," + customer.getFirstName()  + "] has a balance of " + account.getBalance());
		System.out.println();
		
		System.out.println("Retrieving the customer Maria Soley with her joint Checking account with husband Tim.");
		customer = bank.getCustomer(3);
		System.out.println(customer.getAccount());
		account = customer.getAccount();
		System.out.println("Deposit 500.00: " + account.deposit(500.00));
		System.out.println("Withdraw 750.00: " + account.withdraw(750.00));
		System.out.println("Customer [" + customer.getLastName() + "," + customer.getFirstName() + "] has a balance of " + account.getBalance());
	}
}
