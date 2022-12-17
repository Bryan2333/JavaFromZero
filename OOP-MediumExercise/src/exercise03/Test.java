package exercise03;

public class Test {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Jack", 200, 30, 1.2, 2000);
        manager1.setBonus(3000);
        manager1.printSalary();

        Worker worker1 = new Worker("Smith", 150, 30, 1);
        worker1.printSalary();
    }
}
