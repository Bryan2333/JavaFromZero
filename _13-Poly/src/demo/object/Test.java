package demo.object;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {

        /*Person p1 = new Person("Jack", 20, '男');
        Person p2 = new Person("Jack", 20, '男');
        Person p3 = new Person("Jack", 20, '女');
        Person p4 = p1;*/

        /*System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));*/
        // System.out.println(p1.hashCode() == p2.hashCode());
        /*System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.printf("p1.hashCode = %d, p4.hashCode = %d", p1.hashCode(), p4.hashCode());*/

        Monster monster = new Monster("test", "test", 10000);
        System.out.println(monster.toString());

        Person p1 = new Person("Jack", 20, '男');
        System.out.println(p1);
    }
}
