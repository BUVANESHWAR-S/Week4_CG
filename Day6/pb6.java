package Day6;

import java.util.*;

public class pb6 {

    public static boolean searchInArray(int[] arr, int target) {
        for (int i : arr) {
            if (i == target) return true;
        }
        return false;
    }

    public static boolean searchInHashSet(HashSet<Integer> set, int target) {
        return set.contains(target);
    }

    public static boolean searchInTreeSet(TreeSet<Integer> set, int target) {
        return set.contains(target);
    }

    public static void main(String[] args) {
        int[] array = new int[1000000];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 1000000; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        int target = 999999;

        long startTime = System.nanoTime();
        searchInArray(array, target);
        long endTime = System.nanoTime();
        System.out.println("Array Search (1,000,000 elements): " + (endTime - startTime) / 1000000.0 + " ms");

        startTime = System.nanoTime();
        searchInHashSet(hashSet, target);
        endTime = System.nanoTime();
        System.out.println("HashSet Search (1,000,000 elements): " + (endTime - startTime) / 1000000.0 + " ms");

        startTime = System.nanoTime();
        searchInTreeSet(treeSet, target);
        endTime = System.nanoTime();
        System.out.println("TreeSet Search (1,000,000 elements): " + (endTime - startTime) / 1000000.0 + " ms");
    }
}

