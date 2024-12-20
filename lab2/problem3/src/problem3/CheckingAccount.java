package problem3;

public class CheckingAccount extends Account{
	
	final static int FREE_TRANSACTIONS = 4 ; 
	private static double commision = 0.02 ; 
	private int countTransaction ; 
	
	public CheckingAccount( int accNumber) {
		super(accNumber);
		this.countTransaction = 0 ; 
	}
	public int getTransactionCount() {
		return countTransaction; 
	}
	public void deductFee() {
		if(countTransaction > FREE_TRANSACTIONS) {
			int unlimit = countTransaction - FREE_TRANSACTIONS ; 
			double totalFEE = unlimit * commision ; 
			countTransaction-=1 ;
			if(getBalance() >= totalFEE) {
				super.withdraw(totalFEE); 
			}
			else {
				System.err.println("ERROR!");
			}
		}
	}
	@Override
	public void deposit(double sum) {
		super.deposit(sum);
		countTransaction++ ;
		deductFee(); 
	}
	@Override
	public void withdraw(double sum) {
		if(getBalance()>=sum) {
			super.withdraw(sum); 
		}
		countTransaction++ ; 
		deductFee(); 
	}
	@Override
	public String toString() {
		return super.toString() + " {transaction count : " + countTransaction + "}" ; 
	}
}
