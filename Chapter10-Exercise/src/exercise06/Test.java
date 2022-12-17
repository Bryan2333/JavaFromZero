package exercise06;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("张三", new Horse());
        p1.common();
        p1.passRiver();
        p1.passVolcano();
    }
}
