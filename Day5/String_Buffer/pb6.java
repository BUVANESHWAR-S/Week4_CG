package Day5.String_Buffer;

import java.io.*;

public class pb6 {

    public static void main(String[] args) {
        String fileName = "output.txt";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(fileName, true)) {

            String input;
            System.out.println("Enter text (type 'exit' to stop):");
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(input + System.lineSeparator());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
