package banking1;

public class Account {
	private double balance;
	public Account(double init_balance){
		balance = init_balance;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double money){
		balance += money;
	}
	public void withdraw (double money){
		if (money<=this.balance){			
			balance -= money;
		}
		else{
			System.out.println("余额不足！");
		}
	}
}
