package Exercise;

public class Exercise01 {
    public static void main(String[] args) {
        for (Week value : Week.values()) {
            System.out.println(value);
        }
    }
}

enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");

    private String name;

    Week(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}