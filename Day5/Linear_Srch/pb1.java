package Day5.Linear_Srch;

public class pb1 {

    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, -2, 7, 4};
        int result = findFirstNegative(arr);
        System.out.println(result);
    }
}

