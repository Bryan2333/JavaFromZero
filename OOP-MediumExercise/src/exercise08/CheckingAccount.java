package exercise08;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double initBalance) {
        super(initBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
