package Day1.HashMap;

import java.util.*;

public class pb1 {

    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> sumIndicesMap = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        sumIndicesMap.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumIndicesMap.containsKey(sum)) {
                for (int start : sumIndicesMap.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            sumIndicesMap.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, -4, -2, -2};
        List<int[]> subarrays = findZeroSumSubarrays(arr);
        for (int[] range : subarrays) {
            System.out.println("Subarray from index " + range[0] + " to " + range[1]);
        }
    }
}

