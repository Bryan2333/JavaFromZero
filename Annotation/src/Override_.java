public class Override_ {
    public static void main(String[] args) {

    }
}

class Person {
    public void say() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    @Override
    public void say() {
        System.out.println("I am a student");
    }
}