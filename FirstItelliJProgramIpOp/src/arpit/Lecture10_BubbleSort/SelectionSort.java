package arpit.Lecture10_BubbleSort;

import java.util.Arrays;



public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n =arr.length;
        for(int i=0;i<n-1;i++){
          int lastidx = n-i-1;
          int mxidx = getMaxIndex(arr,lastidx);
          int temp = arr[lastidx];
          arr[lastidx]=arr[mxidx];
          arr[mxidx]=temp;
        }
    }

    private static int getMaxIndex(int[] arr,int last) {
        int idx=-1;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<=last;i++){
            if(arr[i]>mx){
                mx = arr[i];
                idx = i;
            }
        }
        return idx;
    }
}
