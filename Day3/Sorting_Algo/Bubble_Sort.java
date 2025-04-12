package Day3.Sorting_Algo;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] marks = {88, 45, 60, 90, 35, 99};

        for(int i = 0; i<marks.length-1; i++){
            int temp = 0;
            boolean swap = false;
            for(int j = 0; j <marks.length-i-1; j++){
                if(marks[j+1] < marks[j]){
                    temp = marks[j+1];
                    marks[j+1] = marks[j];
                    marks[j] = temp;
                    swap = true;
                }

            }
            if(!swap){
                break;
            }
        }
        System.out.println(Arrays.toString(marks));
    }
}
