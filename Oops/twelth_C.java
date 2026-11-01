package oops;

class BankAccountt{
    String accountHolder;
    double balance;

    BankAccountt(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit successful");
    }

    void displayBalance() {
        System.out.println("Account holder name = " + accountHolder);
        System.out.println("Updated balance = " + balance);
    }

    void withdrwal(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class twelth_C {
    public static void main(String[] args) {
        BankAccountt a = new BankAccountt("Om", 1000);

        a.withdrwal(1500);
        a.displayBalance();
    }
}