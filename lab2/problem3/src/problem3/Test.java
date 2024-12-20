package problem3;

public class Test {
	public static void main(String[] args) {
		Bank bank = new Bank(); 
		CheckingAccount account1 = new CheckingAccount( 44005775); 
		SavingsAccount account2 = new SavingsAccount( 44005758, 0.3);
		
		CheckingAccount account3 = new CheckingAccount(44005757); 
		SavingsAccount account4 = new SavingsAccount(44000000 , 0.5 ); 
		
		Bank.openAccount(account1);
		Bank.openAccount(account2);
		Bank.openAccount(account3); 
		Bank.openAccount(account4);
		
		account1.deposit(2000);
		account1.withdraw(400);
		account2.deposit(590);
		account2.deposit(600);
		account2.withdraw(1100);
		account1.deposit(1); 
		account1.withdraw(1);
		bank.seeAccounts();
		
		System.out.println("After update : ");
		bank.update();
		account3.deposit(400);
		bank.closeAccount(44000000);
		account1.deposit(0);
		account1.deposit(0);
		bank.seeAccounts();
	}
}
