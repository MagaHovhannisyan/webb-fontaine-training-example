package information;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        writeInFileWithClose();
        writeInFileWithTryWithResources();
        readFromFile();
        readFast();
        writeFast();
    }

    // OUTPUT STREAM - used to write in File
    // while using outputStream, if there is not a file with defined name, it will create one
    public static void writeInFileWithClose() {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("abc.txt");
            fout.write(65); // only one byte
            String str = "Hello";
            fout.write(str.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Couldn't write");
            e.printStackTrace();
        } finally {
            if (fout != null)
                try {
                    //It is very important to close the stream, otherwise memory issues can arise
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    /*
    TRY WITH RESOURCES - to avoid using Close inside Finally, we can write the Stream inside Try,
    in this case the Stream will be closed automatically
     */
    public static void writeInFileWithTryWithResources() {
        try (FileOutputStream fout = new FileOutputStream("abc.txt")) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // INPUT STREAM - to read from File
    // while using inputStream, if there is not a file with defined name, it will through to FileNotFoundException exception

    public static void readFromFile() {
        try (FileInputStream fis = new FileInputStream("abc.txt")) {
            int result;
            while ((result = fis.read()) != -1) { // when there is already nothing to return, it returns -1
                System.out.print((char) result); // char in order to print the text not the number
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // BUFFER INPUT STREAM - to be used while reading big Files
    public static void readFast() {
        try (FileInputStream fis = new FileInputStream("abc.txt");
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            int result;
            while ((result = bis.read()) != -1) {
                System.out.print((char) result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // BUFFER INPUT STREAM - to be used while reading big Files
    public static void writeFast() {
        try (FileOutputStream fout = new FileOutputStream("abc.txt");
             BufferedOutputStream bout = new BufferedOutputStream(fout)) {
            bout.write("Hi there".getBytes());
            bout.flush(); // !Very important, forces any buffered output bytes to be written out (amboxchutyamb datarkuma) todo flsuhi masin kardal, te erb piti ogtagorcvi
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // FILE WRITER - takic buffernera anum, write-y getbyte chi uzum
    public static void fileWrite() { // todo imast uni filewriter-i jk bufferwriter ogtagorcel?
        try {
            FileWriter writer = new FileWriter("abc.txt");
            writer.write("File write");
            writer.append("adds in the end");
            writer.flush(); // !Not to forget
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // FILE READER - nuyn dzev
    public static void fileRead() {
        try {
            FileReader writer = new FileReader("abc.txt");
            writer.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}