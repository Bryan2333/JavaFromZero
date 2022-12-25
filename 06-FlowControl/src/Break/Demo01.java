package Break;

public class Demo01 {
    public static void main(String[] args) {

        int count = 0;
        do{
            count++;
            int num = (int)(Math.random() * 100 + 1);
            if (num == 97) {
                break;
            }
        }while(true);
        System.out.println("count = " + count);
    }
}
