package Day5.Binary_Srch;

public class pb1 {

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 9, 15, 19, 2, 3};
        int result = findRotationPoint(arr);
    }
}

