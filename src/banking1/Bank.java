package banking1;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	public Bank(){
		customers = new Customer[50];
	}
	public void addCustomer (String f, String l){
		Customer cust = new Customer(f, l);
		customers[numberOfCustomers++] = cust;
	}
	public int getNumOfCustomers (){
		return numberOfCustomers;
	}
	public Customer getCustomer (int index){
		return customers[index];
	}
}
