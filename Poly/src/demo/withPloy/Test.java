package demo.withPloy;

import demo.withPloy.animal.*;
import demo.withPloy.food.*;
import demo.withPloy.animal.Animal;
import demo.withPloy.animal.Dog;
import demo.withPloy.food.Bone;
import demo.withPloy.food.Food;

public class Test {
    public static void main(String[] args) {
        Master Tom = new Master("Tom");
        Animal dog = new Dog("大黄");
        Food bone = new Bone("大棒骨");

        System.out.println(dog.testName);
        /*Tom.feed(dog, bone);

        Animal cat = new Cat("小花猫");
        Food fish = new Fish("黄花鱼");
        Tom.feed(cat, fish);

        Pig pig = new Pig("猪");
        Food rice = new Rice("米");
        Tom.feed(pig, rice);*/
    }
}
