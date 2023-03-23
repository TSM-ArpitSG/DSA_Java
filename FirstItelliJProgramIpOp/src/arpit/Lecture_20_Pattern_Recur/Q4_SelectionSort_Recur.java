package arpit.Lecture_20_Pattern_Recur;

import java.util.Arrays;

public class Q4_SelectionSort_Recur {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3};
        bubble_sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    // better approach is to consider the max element in each pass would be the first index 0 element
    private static void bubble_sort(int[] arr, int i, int j,int mxidx) {
        if(i==1)
            return;
        if(j<i){
            if(arr[mxidx]<arr[j]){
                mxidx=j;
            }
            bubble_sort(arr,i,j+1,mxidx);
        }
        else{
            swap(arr,mxidx,i-1);
            bubble_sort(arr,i-1,0,0);
        }
    }

//    private static void bubble_sort(int[] arr, int i, int j, int max,int mxidx) {
//        if(i==1)
//            return;
//        if(j<i){
//            if(max<arr[j]){
//                max=arr[j];
//                mxidx=j;
//            }
//            bubble_sort(arr,i,j+1,max,mxidx);
//        }
//        else{
//            swap(arr,mxidx,i-1);
//            bubble_sort(arr,i-1,0,Integer.MIN_VALUE,-1);
//        }
//    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
