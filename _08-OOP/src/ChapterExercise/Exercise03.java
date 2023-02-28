package ChapterExercise;

public class Exercise03 {
    public static void main(String[] args) {

        Book book1 = new Book(180.0);
        book1.updatePrice();
        System.out.println("book1.price = " + book1.price);

        Book book2 = new Book(120.0);
        book2.updatePrice();
        System.out.println("book2.price = " + book2.price);

        Book book3 = new Book(80.0);
        book3.updatePrice();
        System.out.println("book3.price = " + book3.price);
    }
}

class Book {
    double price;

    public Book(double price) {
        this.price = price;
    }

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        }
    }
}