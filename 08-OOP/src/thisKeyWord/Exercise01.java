package thisKeyWord;

public class Exercise01 {
    public static void main(String[] args) {

        Person p1 = new Person("张三", 18);
        Person p2 = new Person("李四", 19);
        System.out.println(p1.compareTo(p2));
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person p) {
        if (p == null) {
            return false;
        }
        /*if (this.name.equals(p.name) && this.age == p.age) {
            return true;
        } else {
            return false;
        }*/
        return this.name.equals(p.name) && this.age == p.age;
    }
}
