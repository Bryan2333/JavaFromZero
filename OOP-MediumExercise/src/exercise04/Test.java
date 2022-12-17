package exercise04;

public class Test {
    public static void main(String[] args) {
        Worker Peter = new Worker("Peter", 5000);
        Farmer Smith = new Farmer("Smith", 3000);
        Waiter Tom = new Waiter("Tom", 6000);
        Teacher Tim = new Teacher("Tim", 8000, 360, 1000);


        Peter.showAnnualSalary();
        Smith.showAnnualSalary();
        Tom.showAnnualSalary();
        Tim.showAnnualSalary();

    }
}
