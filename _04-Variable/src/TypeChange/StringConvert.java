package TypeChange;

public class StringConvert {
    public static void main(String[] args) {

        // 基本数据类型 -> String
        /*int n1 = 100;
        float f1 = 1.1F;
        double d1 = 1.23;
        boolean b1 = true;

        String str1 = n1 + "";
        String str2 = f1 + "";
        String str3 = d1 + "";
        String str4 = b1 + "";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);*/

        // String -> 基本数据类型
        String str = "123";
        String str1 = "true";
        int n1 = Integer.parseInt(str);
        float f1 = Float.parseFloat(str);
        double d1 = Double.parseDouble(str);
        boolean b1 = Boolean.parseBoolean(str1);

        System.out.println(n1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(b1);

        char[] charArray = str1.toCharArray();
        System.out.println(charArray.length);
        /*for (char c : charArray) {
            System.out.println(c);
        }*/
    }
}
