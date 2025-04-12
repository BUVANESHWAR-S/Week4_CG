package Day5.String_Buffer;

import java.io.*;

public class pb4 {

    public static void main(String[] args) {
        String fileName = "example.txt";
        String targetWord = "word";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + targetWord + "' appears " + count + " times.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

