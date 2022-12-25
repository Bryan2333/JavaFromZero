package withEnum.useEnum_;

import javax.crypto.SealedObject;

public class Demo01 {
    public static void main(String[] args) {
        for (Season i : Season.values()) {
            System.out.println(i);
        }

        /*Season spring01 = Season.SPRING;
        Season spring02 = Season.SPRING;
        System.out.println(spring01 ==  spring02);*/

    }
}

enum Season {
    SPRING("春天", "温暖"), SUMMER("夏天", "炎热"), AUTUMN, WINTER;

    private String name;
    private String desc;

    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    Season() {}

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
