package Day6;

import java.io.*;

public class pb4 {

    public static void readUsingFileReader(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        int character;
        while ((character = fileReader.read()) != -1) {}
        fileReader.close();
    }

    public static void readUsingInputStreamReader(String fileName) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileName));
        int character;
        while ((character = inputStreamReader.read()) != -1) {}
        inputStreamReader.close();
    }

    public static void main(String[] args) throws IOException {
        String fileName = "largefile.txt";

        long startTime = System.nanoTime();
        readUsingFileReader(fileName);
        long endTime = System.nanoTime();
        System.out.println("FileReader Time (500MB): " + (endTime - startTime) / 1000000.0 + " ms");

        startTime = System.nanoTime();
        readUsingInputStreamReader(fileName);
        endTime = System.nanoTime();
        System.out.println("InputStreamReader Time (500MB): " + (endTime - startTime) / 1000000.0 + " ms");
    }
}

