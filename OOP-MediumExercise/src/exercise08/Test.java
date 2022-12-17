package exercise08;

public class Test {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(5000);
//        checkingAccount.deposit(100);
//        System.out.println(checkingAccount.getBalance());
//        checkingAccount.withdraw(100);
//        System.out.println(checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        for (int i = 0; i < 3; i++) {
            savingsAccount.deposit(100);
        }
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());

        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());

    }
}