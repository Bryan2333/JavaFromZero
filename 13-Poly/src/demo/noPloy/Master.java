package demo.noPloy;

import demo.noPloy.animal.Dog;
import demo.noPloy.animal.Cat;
import demo.noPloy.food.Bone;
import demo.noPloy.food.Fish;


public class Master {
    private String name;

    public Master(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feed(Dog dog, Bone bone) {
        if (dog == null || bone == null) {
            return;
        }
        System.out.printf("主人%s给%s喂骨头\n", this.name, dog.getName());
    }

    public void feed(Cat cat, Fish fish) {
        if (cat == null || fish == null) {
            return;
        }
        System.out.printf("主人%s给%s喂鱼\n", this.name, cat.getName());
    }

    /*public void feed(Animal animal, Food food) {
        if (animal == null || food == null) {
            return;
        }
        System.out.printf("主人%s给%s喂%s\n", this.name, animal.getName(), food.getName());
    }*/
}
