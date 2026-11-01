package oops;
class BankAccount{
	String accountHolder;
	double balance;
	BankAccount(String accountHolder , double balance){
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Current Balance is " + balance);
	}
	
	void displayBalance() {
		System.out.println("Account holder name = " +accountHolder);
		System.out.println("Updated balance = " + balance);
	}
}

public class eleventh_C {

	public static void main(String[] args) {
		BankAccountt a = new BankAccountt("Om" , 1000);
		a.deposit(500);
		a.displayBalance();

	}

}
