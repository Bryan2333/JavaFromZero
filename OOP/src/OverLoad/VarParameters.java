package OverLoad;

public class VarParameters {
    public static void main(String[] args) {

        Cal cal = new Cal();
        System.out.println(cal.sum(1, 2, 3, 4, 5));
    }
}

class Cal {

    public int sum(int n1) {
        return n1;
    }

    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    //可变参数 nums相当于一个数组
    public int sum(int... nums) {
        if (nums != null) {
            int sum = 0;
            for (int i : nums) {
                sum += i;
            }
            return sum;
        } else {
            return 0;
        }
    }
}