package demo.ployArray;

public class Test {
    public static void main(String[] args) {

        /*Person[] people = new Person[5];
        people[0] = new Person("张三", 18);
        people[1] = new Student("Jack", 18, 100);
        people[2] = new Student("Smith", 20, 95);
        people[3] = new Teacher("Tom", 21, 10000);
        people[4] = new Teacher("Peter", 43, 20000);

        for (var i : people) {
            System.out.println(i.printInfo());
            if (i instanceof Student) {
                ((Student) i).learn();
            } else if (i instanceof Teacher) {
                ((Teacher) i).teach();
            }
        }*/

        Person p1 = new Person("Smith", 19);
        Person p2 = new Person("Smith", 19);
        String str = "";
        System.out.println(p1.equals(p2));
    }
}
