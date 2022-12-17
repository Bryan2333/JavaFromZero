package exercise08;

public class SavingsAccount extends BankAccount{
    private int count = 3;
    private double rate = 0.01;

    public SavingsAccount(double initBalance) {
        super(initBalance);
        this.count = count;
    }

    //每个月初，我们统计上个月的利息，同时将count重置为3
    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance() * rate);
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }
}
