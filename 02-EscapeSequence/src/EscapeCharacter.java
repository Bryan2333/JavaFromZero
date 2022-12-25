/*  \t：一个制表位，实现对其功能
    \n：换行符
    \" ：一个 “
    \'：一个 ‘
    \r：一个回车 */

public class EscapeCharacter {
    public static void main(String[] args) {

        // \t：一个制表位，实现对其功能
        System.out.println("北京\t上海\t广州");
        System.out.println("---------------");

        // \n：换行符
        System.out.println("北京\n上海\n广州");
        System.out.println("---------------");

        // \\：一个\
        System.out.println("\\北京\\上海\\广州");
        System.out.println("---------------");

        // \": 一个"
        System.out.println("\"Hello, World!\"");
        System.out.println("---------------");

        // \': 一个'
        System.out.println("\'Hello, World!\'");
        System.out.println("---------------");

        // \r: 一个回车
        System.out.println("Micro\rsoft");
    }
}

