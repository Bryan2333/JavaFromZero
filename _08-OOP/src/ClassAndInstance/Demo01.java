package ClassAndInstance;

public class Demo01 {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setAge(3);
        cat1.setName("cat");
        cat1.setColor("White");

        System.out.println(cat1.getAge());
        System.out.println(cat1.getName());
        System.out.println(cat1.getColor());

        }
    }

class Cat {
    private int age;

    private String name;

    private String color;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}