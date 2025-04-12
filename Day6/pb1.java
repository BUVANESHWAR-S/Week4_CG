package Day6;

import java.util.Arrays;

public class pb1 {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] smallDataset = new int[1000];
        int[] mediumDataset = new int[10000];
        int[] largeDataset = new int[1000000];

        // Filling datasets
        for (int i = 0; i < smallDataset.length; i++) smallDataset[i] = i;
        for (int i = 0; i < mediumDataset.length; i++) mediumDataset[i] = i;
        for (int i = 0; i < largeDataset.length; i++) largeDataset[i] = i;

        int target = 5000;

        long startTime = System.nanoTime();
        linearSearch(smallDataset, target);
        long endTime = System.nanoTime();
        System.out.println("Linear Search (Small Dataset): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        Arrays.sort(mediumDataset);
        binarySearch(mediumDataset, target);
        endTime = System.nanoTime();
        System.out.println("Binary Search (Medium Dataset): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linearSearch(largeDataset, target);
        endTime = System.nanoTime();
        System.out.println("Linear Search (Large Dataset): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        Arrays.sort(largeDataset);
        binarySearch(largeDataset, target);
        endTime = System.nanoTime();
        System.out.println("Binary Search (Large Dataset): " + (endTime - startTime) + " ns");
    }
}

