package Association;

public class Author{
    private Book numbBook; 
    private int num = 0;

    public void setBook(Book b) {
        if (numbBook == null) {
            numbBook = b;
            num++;
        } else {
            throw new IllegalStateException("Class Author can only have one instance of Book.");
        }
    }

    public int getBook(){
        return num;
    }
}
