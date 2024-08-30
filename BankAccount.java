
public class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	BankAccount(int accountNum, String name, double balance)
	{
		this.accountNumber = accountNum;
		this.accountHolderName = name;
		this.balance = balance;
	}
	
	void deposit(double amount)
	{
		this.balance = this.balance + amount;
	}
	
	void withdraw(double amount)
	{
		if(amount<=this.balance)
		{
			this.balance = this.balance - amount;
		}
	}
	
	void check_balance()
	{
		System.out.println("Current Balance: " + this.balance);
	}
	
	void transfer(double amount, BankAccount target)
	{
		if(amount<=this.balance)
		{
			target.balance = target.balance + amount;
		}
		
		this.balance = this.balance - amount;
	}
	
	void getAccountDetails()
	{
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Account Holder Name: " + this.accountHolderName);
		System.out.println("Balance: " + this.balance);
	}
	
	void setAccountHolderName(String newName)
	{
		this.accountHolderName = newName;
	}
}
