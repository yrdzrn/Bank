package banking1;

public class Account {
	protected double balance;
	public Account(double init_balance){
		balance = init_balance;
	}
	public double getBalance(){
		return balance;
	}
	public boolean deposit(double money){
		balance += money;
		return true;
	}
	public boolean withdraw (double money){
		if (money<=this.balance){			
			balance -= money;
			return true;
		}
		else{
			return false;
		}
	}
}
