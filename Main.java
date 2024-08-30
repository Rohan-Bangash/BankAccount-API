public class Main {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("4412", "Jon Cliff", 1000);
		BankAccount acc2 = new BankAccount("2969", "Daniel Crothers", 700);
		
		/*System.out.println(acc1.getBalance());
		System.out.println(acc1.getAccountHolderName());
		System.out.println(acc1.getBalance());
		acc1.deposit(500);
		System.out.println(acc1.getBalance());
		acc1.withdraw(300);
		System.out.println(acc1.getBalance());
		*/
		
		System.out.println(acc2.getBalance());
		acc1.transfer(acc2, 300);
		System.out.println(acc1.getBalance());
		
		
	}

}