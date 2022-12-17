package exercise01;

public class Test {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("张三", 43, "Java工程师");
        person[1] = new Person("李四", 25, "大数据工程师");
        person[2] = new Person("王五", 22, "运维工程师");

        Person temp;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() > person[j+1].getAge()) {
                    temp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = temp;
                }
            }
        }

        for (Person p : person) {
            System.out.println(p);
        }
    }
}
