package class6Library;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static class6Library.Constants.*;

public class TestAPI {
        DataProvider object = DataProvider.getInstance();

    @Test
    public void getAllAuthorsPositive(){
        String result =object.getAllBooksOfGivenAuthor("Author11");
        Assert.assertEquals(result, "Book5 ");
    }

    @Test
    public void getAllAuthorsNegative(){
        String result =object.getAllBooksOfGivenAuthor("Author101");
        Assert.assertEquals(result, NO_BOOK_OF_GIVEN_AUTHOR);
    }

    @Test
    public void getAllAuthorsMatchingGivenBookPositive(){
        String result =object.getAllAuthorsMatchingGivenBook("Book4");
        Assert.assertEquals(result, "Author2 Author4 ");
    }

    @Test
    public void getAllAuthorsMatchingGivenBookNegative(){
        String result =object.getAllAuthorsMatchingGivenBook("Book40");
        Assert.assertEquals(result, NO_BOOK_MATCHING_GIVEN_AUTHOR);
    }

    @Test
    public void getAllBooksMatchingGivenAuthorPositive(){
        String result =object.getAllBooksMatchingGivenAuthor("Author0");
        Assert.assertEquals(result, "Book0 Book1 ");
    }

    @Test
    public void getAllBooksMatchingGivenAuthorNegative(){
        String result =object.getAllBooksMatchingGivenAuthor("Author00");
        Assert.assertEquals(result, NO_AUTHOR_MATCHING_GIVEN_BOOK);
    }

    @Test
    public void getBooksInSpecificPeriodPositive(){
        String result =object.getBooksInSpecificPeriod(2013, 2015);
        Assert.assertEquals(result, "Book3 Book4 Book5 ");
    }

    @Test
    public void getBooksInSpecificPeriodNegative(){
        String result =object.getBooksInSpecificPeriod(2022, 2025);
        Assert.assertEquals(result, NO_AUTHOR_MATCHING_GIVEN_PERIOD);
    }
}