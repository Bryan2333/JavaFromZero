//单精度浮点数和双精度浮点数

package DataType;

import java.math.BigDecimal;

public class FloatDemo {
    public static void main(String[] args) {

        float a = 134.2F;
        double b = 5.12e-2;

        // 浮点数精度对比
        /*double x = 2.1234567851;
        float y = 2.1234567851F;
        System.out.println(x);
        System.out.println(y);*/

        // 浮点数陷阱
        double x = 2.7;
        double y = 8.1 / 3;
        System.out.println(x);
        System.out.println(y);
//        System.out.println(Math.abs(x  - y));
        if (Math.abs(x - y) < 0.00001) {
            System.out.println("x == y");
        }

    }
}
