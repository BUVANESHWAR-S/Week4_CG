package Day3.Sorting_Algo;

import java.util.Arrays;

public class mrg_srt {

    static int[] mrg_srt(int[] arr){
        if(arr.length == 1){
            return arr;
        }
//        int start = 0;
//        int end = arr.length;
        int mid = arr.length/2;
        int[] first = mrg_srt(Arrays.copyOfRange(arr, 0, mid));
        int[] second = mrg_srt(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(first, second);
    }
    static int[] merge(int[] first, int[] second){
        int[] result = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while(i < first.length && j<second.length){

            if(first[i] < second[j]){
                result[k] = first[i];
                ++k;
                ++i;
            }else{
                result[k] = second[j];
                ++j;
                ++k;
            }
        }
        while(i < first.length){
            result[k] = first[i];
            ++k;
            ++i;
        }
        while (j < second.length){
            result[k] = second[j];
            ++k;
            ++j;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] bk_price = {200, 120, 400, 340, 700, 1000, 420};
        //mrg_srt(bk_price);
        int[] bk_pice = mrg_srt(bk_price);
        System.out.println(Arrays.toString(bk_pice));
    }
}
