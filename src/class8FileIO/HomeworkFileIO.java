package class8FileIO;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.AccessException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static class8FileIO.ErrorMessages.*;

public class HomeworkFileIO {
    private String[] fileList;

    HomeworkFileIO(String[] fileList) {
        setFileList(fileList);
    }

    public String[] getFileList() {
        return fileList;
    }

    public void setFileList(String[] fileList) {
        this.fileList = fileList;
    }

    // 1. Write a Java program to get a list of all file/directory names from the given directory.
    public String getAllFileNames(String directory) throws FileNotFoundException {
        File file = new File(directory);
        // This part covers 3rd point of the homework as well
        // 3. Write a Java program to check if a file or directory specified by pathname exists or not.
        if (file.exists()) {
            fileList = file.list();
            if (getFileList().length == 0) {
                throw new FileNotFoundException(NO_FILE_IN_DIRECTORY.getValue());
            }
        } else {
            throw new FileNotFoundException(INVALID_FILE_PATH.getValue());
        }
        return Arrays.toString(getFileList());
    }

    // 2. Write a Java program to get specific files by extensions from a specified directory.
    public String getFilesByExtensions(String directory, String extension) throws FileNotFoundException {
        int i = 0;
        List<String> list = new ArrayList<String>();
        getAllFileNames(directory);
        for (i = 0; i < getFileList().length; ++i) {
            if (fileList[i].endsWith(extension)) {
                list.add(fileList[i]);
            }
        }
        if (list.isEmpty()) {
            throw new FileNotFoundException(NO_FILE_WITH_GIVEN_EXTENSION.getValue());
        }
        return list.toString();
    }

    // 4. Write a Java program to check if a file has read and write permission or not.
    public void checkFilePermission(String directory) throws FileNotFoundException, AccessException {
        File file = new File(directory);
        if (!file.exists()) {
            throw new FileNotFoundException(NO_FILE_IN_DIRECTORY.getValue());
        } else if (file.canRead() && file.canWrite()) {
            System.out.println("File has read and write permission");
        } else {
            throw new AccessException(NOREAD_NOWRITE_ACCESS.getValue());
        }
    }

    // 5. Write a Java program to get file size in bytes, kb, mb.
    public int getFileSize(String directory, String sizeFormat) throws FileNotFoundException, IllegalArgumentException {
        File file = new File(directory);
        int fileSize;
        int fileSizeBytes = (int) file.length();
        int fileSizeKB = fileSizeBytes / 1024;
        int fileSizeMB = fileSizeKB / 1024;
        if (!file.exists()) {
            throw new FileNotFoundException(NO_FILE_IN_DIRECTORY.getValue());
        } else {
            switch (sizeFormat) {
                case "bytes":
                    fileSize = fileSizeBytes;
                    break;
                case "kb":
                    fileSize = fileSizeKB;
                    break;
                case "mb":
                    fileSize = fileSizeMB;
                    break;
                default:
                    throw new IllegalArgumentException(INVALID_FILE_SIZE.getValue());
            }
        }
        return fileSize;
    }

    // 6. Write a Java program to store text file content line by line into an array.
    public String fileContentIntoArray(String filePath) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filePath));
        String str;
        List<String> list = new ArrayList<String>();
        while (((str = in.readLine()) != null)) {
            list.add(str);
        }
        if (list.isEmpty()) {
            throw new IOException(EMPTY_FILE.getValue());
        }
        return list.toString();
    }

    // 7. Write a method that will count the number of lines in each file that is specified on the parameter.
    public int countLines(String filePath) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filePath));
        int lineCount = 0;
        while (((in.readLine()) != null)) {
            lineCount++;
        }
        return lineCount;
    }

    // 8. Write a Java program to read content from one file and write it into another file.
    public void readAndWriteContent(String readFilePath, String writeFilePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(readFilePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writeFilePath))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println();
            e.printStackTrace();
        }
    }

    // 9. Write a copy file and delete file methods.
    public void copyFile(String sourcePath, String destinationPath) {
        Path path1 = Paths.get(sourcePath);
        Path path2 = Paths.get(destinationPath);
        try {
            Files.copy(path1, path2);
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists and unable to copy");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Permission issue");
            e.printStackTrace();
        }
    }

    public void deleteFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            throw new FileNotFoundException(ErrorMessages.INVALID_FILE_PATH.getValue());
        }
    }

    /*
    10. Write a program to read from the file the count of / how many times "hello" word
    is appeared in each line and write the collected statistics into result.txt
     */
    public void countOfWord(String readFilePath, String word) throws IOException {
        int count = 0;
        BufferedReader in = new BufferedReader(new FileReader(readFilePath));
        FileWriter writer = new FileWriter("src/class8FileIO/Result");
        ArrayList<String> list = new ArrayList<String>();
        String str;
        while (((str = in.readLine()) != null)) {
            list.add(str);
        }
        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).contains(word)) {
                count++;
            }
        }
        writer.write("The word " + word + " appears " + count + " times");
        writer.flush();
    }
}