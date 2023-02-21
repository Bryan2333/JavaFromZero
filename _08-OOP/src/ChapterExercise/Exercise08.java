package ChapterExercise;

public class Exercise08 {
    public static void main(String[] args) {

        new Exercise08().count1();
        Exercise08 exercise08 = new Exercise08();
        exercise08.count2();
        exercise08.count2();
    }

    int count = 9;

    public void count1() {
        count = 10;
        System.out.println("count = " + count);
    }

    public void count2() {
        System.out.println("count = " + count++);
    }
}
