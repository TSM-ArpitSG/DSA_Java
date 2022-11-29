package arpit.Lecture10_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CycleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //works only for arrays in range (1,N)
    // duplicate elements will just be swapped with the index where the correct element of the position where the duplicates lie at currently.
    static void cycleSort(int[] arr) {
        int n = arr.length;
        int i=0;
        while (i<n){
            int correctidx = arr[i]-1;
            if(arr[i]!=arr[correctidx])
                swap(arr,i,correctidx);
            else
                i++;
        }
    }

     static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
