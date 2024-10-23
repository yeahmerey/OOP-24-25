package problem3;

public class Account{
	 
	private double balance; // The current balance
	private final int accNumber; // The account number
	private boolean allowBank = true; 
	private String fullName ; 
	
	public Account(int a){ 
		balance = 0.0;
		accNumber = a;
	}
	public Account(int a , String fullname) {
		balance = 0.0 ; 
		accNumber = a;  
		this.fullName = fullname ; 
	}
	
	public void deposit(double sum) {
		this.balance += (allowBank) ? sum : 0 ; 
	}
	
	public void withdraw(double sum) {
		if(this.balance - sum < 0 ) {
			System.out.println("You can't withdraw money!ERROR"); 
			return ; 
		}
		this.balance -= sum  ; 
	}
	
	public void setStatus(boolean allow) {
		this.allowBank = allow ; 
	}
	public String getFullName() {
		return fullName;  
	}
	public double getBalance() {
		return balance ; 
	}
	public double getAccountNumber() {
		return accNumber ; 
	}
	public void transfer(double amount, Account other) {
		if(allowBank && amount <= balance && !(amount < 0 )) {
			this.withdraw(amount);
			other.deposit(amount); 
		}
		else {
			System.out.println("Transfer failed :( "); 
		}
	}
	public String toString() {
		return "Account [number : " + accNumber + ", balance : " + balance + "₸"; 
	}
	public final void print() {
		System.out.println(toString());
	}
}

