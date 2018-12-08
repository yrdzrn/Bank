package banking1;

public class CheckingAccount extends Account{
	private double overdraftProtection;
	public CheckingAccount(double balance, double overdraftProtection){
		super(balance);
		this.overdraftProtection = overdraftProtection;
	}
	public CheckingAccount(double balance){
		super(balance);
	}
	public double getOverdraftProtection() {
		return overdraftProtection;
	}
	public void setOverdraftProtection(double overdraftProtection) {
		this.overdraftProtection = overdraftProtection;
	}
	@Override
	public boolean withdraw(double amount) {
		if (balance >= amount){
			balance -= amount;
		}
		else if(overdraftProtection >= (amount-balance)){
			balance = 0;
			overdraftProtection -= (amount-balance);
		}
		else{
			return false;
		}
		return true;
	}
}
