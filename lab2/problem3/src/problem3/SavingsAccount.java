package problem3;

public class SavingsAccount extends Account{
	private double interestRate ;  
	
	public SavingsAccount(int accNumber, double interestRate) {
		super(accNumber) ;
		this.interestRate = interestRate;  
	}

	public void addInterest() {
		double interest = getBalance() * (interestRate / 100); 
		this.deposit(interest);
	}
	@Override 
	public String toString() {
		return super.toString() + ", interest rate : " + interestRate + "%"; 
	}
}
