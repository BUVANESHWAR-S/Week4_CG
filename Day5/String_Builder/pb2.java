package Day5.String_Builder;

import java.util.HashSet;

public class pb2 {

    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aabbccddeeff";
        String result = removeDuplicates(input);
        System.out.println(result);
    }
}

