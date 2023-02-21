package Exercise;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("张三", 18);
        Student stu1 = new Student("李四", 18, 1, 90);

        System.out.println(p1.say());
        System.out.println("=====================");
        System.out.println(stu1.say());
    }
}
