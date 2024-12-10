package Association;

public class Main {
    public static void main(String[] args) {
        Author a = new Author();
        Book b1 = new Book();
        Book b2 = new Book();
        a.setBook(b1);
        //a.setBook(b2);
        System.out.println(a.getBook());
    }
}
