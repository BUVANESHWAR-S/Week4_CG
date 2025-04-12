package Day3.Sorting_Algo;

import java.util.Arrays;

public class insrt_sort {

    static void insrt_srt(int[] arr){
        for(int i = 0; i<arr.length-1;i++){
            for(int j = i+1; j>0 && arr[j-1] > arr[j]; --j){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] emp_id = {3, 4, 1, 5, 2};
        insrt_srt(emp_id);
        System.out.println(Arrays.toString(emp_id));
    }
}
