//数据类型自动转换
package TypeChange;

public class AutoConvert {
    public static void main(String[] args) {
        double a = 100L;
        System.out.println(a);

        int b = 100;
        double c = b;
        System.out.println(b == c);


    }
}
