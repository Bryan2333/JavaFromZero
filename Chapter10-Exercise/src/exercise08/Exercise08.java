package exercise08;

public class Exercise08 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();

        switch (green) {
            case GREEN -> System.out.println("匹配到绿色");
            case RED -> System.out.println("匹配到红色");
            case BLUE -> System.out.println("匹配到蓝色");
            case BLACK -> System.out.println("匹配到黑色");
            case YELLOW -> System.out.println("匹配到黄色");
        }
    }
}

enum Color implements IColor{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue){
        this.redValue = redValue;
        this.blueValue = blueValue;
        this.greenValue = greenValue;
    }

    @Override
    public void show() {
        System.out.printf("%s的属性值为%d %d %d\n", name(), redValue, greenValue, blueValue);
    }
}