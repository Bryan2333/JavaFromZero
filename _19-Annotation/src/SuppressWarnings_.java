import java.util.ArrayList;
import java.util.List;


public class SuppressWarnings_ {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("test1");
        for (var i : list) {
            System.out.println(i);
        }

    }

    public static void f1() {
        List list = new ArrayList();
    }
}
