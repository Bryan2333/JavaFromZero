package withEnum.selfDefClass;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}

//演示自定义枚举
class Season {
    private String name;
    private String desc;

    //1. 将构造器私有化
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    //2. 去掉set方法
    public String getName() {
        return name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    //3. 本类内部创建对象，并对外暴露（用 public static final 修饰）
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season WINTER = new Season("冬天", "寒冷");

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}