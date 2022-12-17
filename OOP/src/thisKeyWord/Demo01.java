package thisKeyWord;

public class Demo01 {
    public static void main(String[] args) {

        Dog dog1 = new Dog("test01", 3);
        dog1.printInfo();

        Dog dog2 = new Dog("test02", 5);
        dog2.printInfo();
    }
}

class Dog {

    String name;
    int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("name = %s, age = %d\n", this.name, this.age);
        System.out.printf("当前对象的HashCode = %s\n", this.hashCode());
    }
}
