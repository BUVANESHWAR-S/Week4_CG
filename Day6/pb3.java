package Day6;

public class pb3 {

    public static void stringConcatenation(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += "a";
        }
    }

    public static void stringBuilderConcatenation(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append("a");
        }
    }

    public static void stringBufferConcatenation(int n) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; i++) {
            result.append("a");
        }
    }

    public static void main(String[] args) {
        int N1 = 1000;
        int N2 = 10000;
        int N3 = 1000000;

        long startTime = System.nanoTime();
        stringConcatenation(N1);
        long endTime = System.nanoTime();
        System.out.println("String Concatenation (1000): " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        stringBuilderConcatenation(N1);
        endTime = System.nanoTime();
        System.out.println("StringBuilder Concatenation (1000): " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        stringBufferConcatenation(N1);
        endTime = System.nanoTime();
        System.out.println("StringBuffer Concatenation (1000): " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        stringConcatenation(N2);
        endTime = System.nanoTime();
        System.out.println("String Concatenation (10000): " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        stringBuilderConcatenation(N2);
        endTime = System.nanoTime();
        System.out.println("StringBuilder Concatenation (10000): " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        stringBufferConcatenation(N2);
        endTime = System.nanoTime();
        System.out.println("StringBuffer Concatenation (10000): " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        stringConcatenation(N3);
        long endTimeString = System.nanoTime();
        System.out.println("String Concatenation (1000000): " + (endTimeString - startTime) / 1000000000.0 + " s");

        startTime = System.nanoTime();
        stringBuilderConcatenation(N3);
        endTime = System.nanoTime();
        System.out.println("StringBuilder Concatenation (1000000): " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        stringBufferConcatenation(N3);
        endTime = System.nanoTime();
        System.out.println("StringBuffer Concatenation (1000000): " + (endTime - startTime) / 1000000 + " ms");
    }
}

