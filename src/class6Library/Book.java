package class6Library;

public class Book {
    private String bookName;
    private Author author;
    private int releaseDate;
    private int bookRate;

    Book(String bookName, int releaseDate, int bookRate, Author author) {
        setBookName(bookName);
        setReleaseDate(releaseDate);
        setAuthor(author);
        setBookRate(bookRate);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getBookRate() {
        return bookRate;
    }

    public void setBookRate(int bookRate) {
        this.bookRate = bookRate;
    }
}