package Day5.Linear_Srch;

public class pb2 {

    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "This is the first sentence.",
                "The quick brown fox jumps over the lazy dog.",
                "Here is another sentence with a word."
        };
        String word = "fox";
        String result = findSentenceWithWord(sentences, word);
        System.out.println(result);
    }
}
