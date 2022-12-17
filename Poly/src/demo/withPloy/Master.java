package demo.withPloy;

import demo.withPloy.animal.Animal;
import demo.withPloy.food.Food;


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

    public void feed(Animal animal, Food food) {
        if (animal == null || food == null) {
            return;
        }
        System.out.printf("主人%s给%s喂%s\n", this.name, animal.getName(), food.getName());
    }
}
