package arpit.Lecture_22_QuickSort;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,1};
        QS(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        // Internal sort -> Hybrid algorithm
        Arrays.sort(arr);
    }

    private static void QS(int[] arr, int low, int high) {
        if(low>=high)
            return;
        int s =low,e =high;
        int p = arr[(s+e)/2];
        while(s<=e){
            while(arr[s]<p)
                s++;
            while (arr[e]>p)
                e--;
            if(s<=e){                               // if array is already sorted from above while loop the s and e index pointer would be
                                                    // already violate the condition that is s>e, therefore this check is used when array is already sorted.
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;e--;
            }
        }
        QS(arr,low,e);      // left-subarray
        QS(arr,s,high);     // right-subarray.
    }
}
