package demo.noPloy;

import demo.noPloy.animal.Cat;
import demo.noPloy.animal.Dog;
import demo.noPloy.food.Bone;
import demo.noPloy.food.Fish;

public class Test {
    public static void main(String[] args) {
        Master Tom = new Master("Tom");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");

        Tom.feed(dog, bone);

        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("黄花鱼");
        Tom.feed(cat, fish);
    }
}
