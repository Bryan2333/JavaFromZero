package exercise08;

public class BankAccount {
    private double balance;
    public BankAccount(double initBalance) {
        this.balance = initBalance;
    }

    //存款
    public void deposit(double amount) {
        this.balance += amount;
    }

    //取款
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
