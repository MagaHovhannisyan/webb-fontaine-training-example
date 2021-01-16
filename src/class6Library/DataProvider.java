package class6Library;

import static class6Library.Constants.*;

public class DataProvider {
    private static DataProvider instance;
    private Book[] book = new Book[10];

    private DataProvider() {
        book[0] = new Book("Book0", 2010, 10, new Author("Author0"));
        book[1] = new Book("Book1", 2011, 8, new Author("Author0"));
        book[2] = new Book("Book1", 2011, 10, new Author("Author1"));
        book[3] = new Book("Book1", 2012, 10, new Author("Author1"));
        book[4] = new Book("Book1", 2008, 4, new Author("Author1"));
        book[5] = new Book("Book1", 2019, 5, new Author("Author1"));
        book[6] = new Book("Book4", 2012, 4, new Author("Author2"));
        book[7] = new Book("Book3", 2013, 4, new Author("Author3"));
        book[8] = new Book("Book4", 2014, 9, new Author("Author4"));
        book[9] = new Book("Book5", 2015, 1, new Author("Author11"));
    }

    public static DataProvider getInstance() {
        if (instance == null) {
            instance = new DataProvider();
        }
        return instance;
    }

    public void getAllAuthors() {
        for (int i = 0; i < book.length; ++i) {
            System.out.println(book[i].getAuthor().getName());
        }
    }

    public void getAllBooks() {
        for (int i = 0; i < book.length; ++i) {
            System.out.println(book[i].getBookName());
        }
    }

    public String getAllBooksOfGivenAuthor(String author) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < book.length; ++i) {
            if (book[i].getAuthor().getName().equals(author)) {
                str.append(book[i].getBookName()).append(" ");
            }
        }
        if (str.length() == 0) {
            return NO_BOOK_OF_GIVEN_AUTHOR;
        }
        System.out.println(str.toString());
        return str.toString();
    }

    public void top3BooksOfGivenAuthor(String author) {
        int[] arr = new int[book.length];
        for (int a = 0; a < book.length; ++a) {
            if (book[a].getAuthor().getName().equals(author)) {
                arr[a] = book[a].getBookRate();
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] < arr[j]) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("Here are the top 3 books of " + author + " : " + arr[0] + " " + arr[1] + " " + arr[2]);
    }

    public String getAllAuthorsMatchingGivenBook(String givenBook) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < book.length; ++i) {
            if (book[i].getBookName().contains(givenBook)) {
                str.append(book[i].getAuthor().getName()).append(" ");
            }
        }
        if (str.length() == 0) {
            return NO_BOOK_MATCHING_GIVEN_AUTHOR;
        }
        System.out.println(str.toString());
        return str.toString();
    }

    public String getAllBooksMatchingGivenAuthor(String author) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < book.length; ++i) {
            if (book[i].getAuthor().getName().contains(author)) {
                str.append(book[i].getBookName()).append(" ");
            }
        }
        if (str.length() == 0) {
            return NO_AUTHOR_MATCHING_GIVEN_BOOK;
        }
        System.out.println(str.toString());
        return str.toString();
    }

    public String getBooksInSpecificPeriod(int startYear, int endYear) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < book.length; ++i) {
            if (startYear <= book[i].getReleaseDate() && endYear >= book[i].getReleaseDate()) {
                str.append(book[i].getBookName()).append(" ");
            }
        }
        if (str.length() == 0) {
            return NO_AUTHOR_MATCHING_GIVEN_PERIOD;
        }
        System.out.println("Here are all the Books for " + startYear + " and " + endYear + " period : " + str.toString());
        return str.toString();
    }
}