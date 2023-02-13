package arpit.Lecture10_Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,-7,3,2,-22};
//        int[] b=arr;
//        b[0]=2;
//        System.out.println(Arrays.toString(b));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int swapcout=0;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapcout++;
                }
            }if(swapcout==0)return;
        }
    }
}
