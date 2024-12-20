package problem3;
import java.util.*;
public class Bank {
	private static Vector<Account> accounts = new Vector<>(); 
	
	public Bank() {}
	
	public static void openAccount(Account account) {
		accounts.add(account); 
	}
	public void closeAccount(int accountNumber) {
		for(Account account : accounts) {
			if(account.getAccountNumber() == accountNumber) {
				accounts.remove(account); 
				return ; 
			}
		}
		System.err.println("Error!Account not found!"); 
	}
	//public void closeAccount(String fullName , int accountNumber) {
	//	for(Account account : accounts) {
	//		if(account.getFullName() == fullName && account.getAccountNumber() == accountNumber) {
	//			accounts.remove(account) ;
	//			return ; 
	//		}
	//	}
	//}
	
	public void update() {
		for(Account account : accounts) {
			if(account instanceof SavingsAccount) {
				((SavingsAccount) account).addInterest(); 
			}
			else if(account instanceof CheckingAccount) {
				((CheckingAccount)account).deductFee();
			}
		}
	}
	
	
	public void seeAccounts() {
		for(Account account : accounts) {
			account.print();
		}
	}
}
