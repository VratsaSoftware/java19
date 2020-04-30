package library;

public class Book extends Edition {
    private String bookName;
    private String bookAuthor;
    private int yearOfPublication;

    public Book(String bookName, String bookAuthor, int yearOfPublication, boolean isAvailable) {
        super(isAvailable);
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Name: " + this.bookName);
        System.out.println("Author: " + this.bookAuthor);
        System.out.println("Year of publication: " + this.yearOfPublication);
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
