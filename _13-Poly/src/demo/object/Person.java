package demo.object;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean equals(Object obj) {
        //如果引用的对象是同一个对象
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person p) {
            // Person p = (Person) obj;
            return this.name.equals(p.name) && p.age == this.age && p.gender == this.gender;
        }
        return false;
    }

    public String toString() {
        return "Person Info { "
                + "name: " + name + ","
                + " age: " + age + ","
                + " gender: " + gender
                + " }";
    }
}
