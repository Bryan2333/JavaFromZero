package Method;

public class Exercise02 {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.name = "test";
        human1.age = 19;
        Human human2 = Tools.cloneHuman(human1);

        System.out.println(human1.name.hashCode());
        System.out.println(human2.name.hashCode());
    }
}

class Human {
    public int age;

    public String name;
    
}

class Tools {
    public static Human cloneHuman(Human human) {
        if (human == null) {
            return null;
        }

        Human humanNew = new Human();
        humanNew.age = human.age;
        humanNew.name = human.name;
        return humanNew;
    }
}