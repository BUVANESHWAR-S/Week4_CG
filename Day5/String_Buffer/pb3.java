package Day5.String_Buffer;

import java.io.*;

public class pb3 {

    public static void main(String[] args) {
        String fileName = "random.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

