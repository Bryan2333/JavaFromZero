import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3};

        while (true) {
            System.out.print("请输入要添加的数字: ");
            int numToAdd = input.nextInt();

            //数组扩容并将添加的数字放到最后一位
            int[] arrayNew = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                arrayNew[i] = array[i];
            }
            arrayNew[arrayNew.length-1] = numToAdd;
            array = arrayNew;

            System.out.print("添加成功！请问是否需要继续添加? y/n : ");
            char ifContinue = input.next().charAt(0);
            if (ifContinue == 'n') {
                break;
            }
        }

        System.out.println("=====扩容后的数组========");
        for (var i : array) {
            System.out.print(i + " ");
        }
     }
}
