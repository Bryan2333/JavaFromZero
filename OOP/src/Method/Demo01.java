package Method;

public class Demo01 {
    public static void main(String[] args) {

        Person p1 = new Person();
        /*p1.speak();
        p1.cal01();
        p1.cal02(20);
        System.out.println("sum = " + p1.getSum(1,9));*/

        p1.age = 10;
        p1.test(p1);
        System.out.println(p1.age);
    }
}

class Person {

    String name;
    int age;

    public void speak() {
        System.out.println("我是个好人");
    }

    public void cal01() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public void cal02(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public int getSum(int x, int y) {
        return x + y;
    }

    public void test(Person p) {
        p.age = 100;
    }
}