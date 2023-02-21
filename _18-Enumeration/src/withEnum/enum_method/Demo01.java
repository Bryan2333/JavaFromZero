package withEnum.enum_method;

public class Demo01 {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring.name());
        System.out.println(spring.ordinal());


        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }

        Season spring2 = Season.valueOf("SPRING");
        System.out.println(spring2);

        System.out.println(Season.SPRING.compareTo(Season.WINTER));
    }
}

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;
}