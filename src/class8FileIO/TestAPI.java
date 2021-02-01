package class8FileIO;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestAPI {
    private HomeworkFileIO homework;
    private String[] fileList;

    @BeforeClass
    public void setup() {
        homework = new HomeworkFileIO(fileList);
    }

    /*
    1. Write a Java program to get a list of all file/directory names from the given directory.
     */
    @Test
    public void getAllFileNamesValidDirectory() throws FileNotFoundException {
        String result = homework.getAllFileNames("src/class6Library");
        Assert.assertEquals(result, "[Author.java, Book.java, Constants.java, DataProvider.java, TestAPI.java]");
    }

    @Test(expectedExceptions = {FileNotFoundException.class}, expectedExceptionsMessageRegExp = "Provided invalid file path.")
    public void getAllFileNamesInvalidDirectory() throws FileNotFoundException {
        homework.getAllFileNames("src/class8FileIOFail");
    }

    @Test(expectedExceptions = {FileNotFoundException.class}, expectedExceptionsMessageRegExp = "No file in given directory.")
    public void getAllFileNamesEmptyFile() throws FileNotFoundException {
        homework.getAllFileNames("src/test");
    }

    /*
    2. Write a Java program to get specific files by extensions from a specified directory
     */
    @Test
    public void getFilesByExtensionsValidCase() throws FileNotFoundException {
        String result = homework.getFilesByExtensions(".idea", ".xml");
        Assert.assertEquals(result, "[dbnavigator.xml, misc.xml, modules.xml, uiDesigner.xml, vcs.xml, workspace.xml]");
    }

    @Test(expectedExceptions = {FileNotFoundException.class}, expectedExceptionsMessageRegExp = "Provided invalid file path.")
    public void getFilesByExtensionsInvalidDirectory() throws FileNotFoundException {
        homework.getFilesByExtensions(".ideaInvalid", ".xml");
    }

    @Test(expectedExceptions = {FileNotFoundException.class}, expectedExceptionsMessageRegExp = "No file with given extension.")
    public void getFilesByExtensionsInvalidExtension() throws FileNotFoundException {
        homework.getFilesByExtensions(".idea", "java");
    }

    /*
    5. Write a Java program to get file size in bytes, kb, mb.
     */
    @Test
    public void getFileSizeBytes() throws FileNotFoundException, IllegalArgumentException {
        int result = homework.getFileSize(".idea", "bytes");
        Assert.assertEquals(result, 4096);
    }

    @Test
    public void getFileSizeKb() throws FileNotFoundException, IllegalArgumentException {
        int result = homework.getFileSize(".idea", "kb");
        Assert.assertEquals(result, 4);
    }

    @Test
    public void getFileSizeMb() throws FileNotFoundException, IllegalArgumentException {
        int result = homework.getFileSize(".idea", "mb");
        Assert.assertEquals(result, 0);
    }

    @Test(expectedExceptions = {IllegalArgumentException.class}, expectedExceptionsMessageRegExp = "Please enter one of the following file sizes : bytes, kb, mb.")
    public void getFileSizeInvalidSize() throws FileNotFoundException, IllegalArgumentException {
        homework.getFileSize(".idea", "InvalidSize");
    }

    @Test(expectedExceptions = {FileNotFoundException.class}, expectedExceptionsMessageRegExp = "No file in given directory.")
    public void getFileSizeInvalidFilePath() throws FileNotFoundException, IllegalArgumentException {
        homework.getFileSize(".ideaInvalid", "InvalidSize");
    }

    /*
    6. Write a Java program to store text file content line by line into an array.
     */
    @Test
    public void fileContentIntoArrayValidCase() throws IOException {
        String list = homework.fileContentIntoArray("src/class8FileIO/TestFileContent");
        Assert.assertEquals(list, "[Line1, Line2, Line3, Line4]");
    }

    @Test(expectedExceptions = {FileNotFoundException.class})
    public void fileContentIntoArrayInvalidFileName() throws IOException {
        homework.fileContentIntoArray("src/class8FileIO/TestFileContentInvaLid");
    }

    @Test(expectedExceptions = {IOException.class}, expectedExceptionsMessageRegExp = "File is empty")
    public void fileContentIntoArrayEmptyFile() throws IOException {
        homework.fileContentIntoArray("src/class8FileIO/TestEmptyFile");
    }

    /*
    7. Write a method that will count the number of lines in each file that is specified on the parameter.
     */

    @Test
    public void countLinesValidCase() throws IOException {
        int lineCount = homework.countLines("src/class8FileIO/TestFileContent");
        Assert.assertEquals(lineCount, 4);
    }

    @Test(expectedExceptions = {FileNotFoundException.class})
    public void countLinesInvalidFile() throws IOException {
        homework.countLines("src/class8FileIO/TestFileContentInvalid");
    }

    @Test
    public void countLinesEmptyFile() throws IOException {
        int lineCount = homework.countLines("src/class8FileIO/TestEmptyFile");
        Assert.assertEquals(lineCount, 0);
    }
}