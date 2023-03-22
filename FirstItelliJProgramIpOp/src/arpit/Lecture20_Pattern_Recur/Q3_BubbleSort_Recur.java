package arpit.Lecture20_Pattern_Recur;

import java.util.Arrays;

public class Q3_BubbleSort_Recur {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubble_Sort_recur(arr, arr.length-1,0 );
        System.out.println(Arrays.toString(arr));
    }
    //using pattern 1: Bubble sort
    public static void bubble_Sort_recur(int[] arr,int i,int j){
        if(i==0)
            return;
        else if(j<i){
            if(arr[j]>arr[j+1]){
                swapelem(arr,j,j+1);
            }
                bubble_Sort_recur(arr,i,j+1);
        }else{
            bubble_Sort_recur(arr,i-1,0);
        }
    }


    private static void swapelem(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
