package exercise13;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        people[0] = new Student("张三", '男', 20, "100000");
        people[1] = new Student("李四", '女', 15, "394784");
        people[2] = new Teacher("Smith", '男', 38, 10);
        people[3] = new Teacher("Tim", '男', 35, 10);

        Person temp = null;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getAge() > people[j+1].getAge()) {
                    temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }

        for (Person p : people) {
            if (p instanceof Student) {
                ((Student) p).printInfo();
            } else if (p instanceof Teacher) {
                ((Teacher) p).printInfo();
            }
            System.out.println("------------------");
        }

        System.out.println(people[0].play());
        System.out.println(people[2].play());
//        callMethod(people[0]);
//        callMethod(people[2]);
    }

    public static void callMethod(Person p) {
        if (p instanceof Student) {
            ((Student) p).study();
        } else if (p instanceof Teacher){
            ((Teacher) p).teach();
        }
    }
}
