package Day3.Sorting_Algo;

import java.util.Arrays;

public class selection_srt {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {85, 92, 78, 90, 69, 95, 88};
        selectionSort(examScores);
        System.out.println(Arrays.toString(examScores));
    }
}
