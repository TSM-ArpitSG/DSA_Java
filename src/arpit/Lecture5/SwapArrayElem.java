package arpit.Lecture5;

import java.util.Arrays;

import static java.lang.Math.max;

public class SwapArrayElem {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,5,4};
        char[] arr2 = {'H','a','n','n','a','h'};
//        System.out.println(Arrays.toString(arr));
//        SwapArr(arr,3,4);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arrmax(arr));
//        reverseArr(arr);
        reverseArr2(arr2);
        System.out.println(arr2);
//        System.out.println(Arrays.toString(arr));

    }

    private static void reverseArr(int[] arr) {
        int start=0;
        int end = arr.length-1;
        while(start!=end){
//            if(start<end){
                SwapArr(arr,start,end);
//            }
            start++;
            end--;
        }
    }
    private static void reverseArr2(char[] arr) {
        int start=0;
        int end = arr.length-1;
        while(start<=end){
//            if(start<end){
            SwapArr2(arr,start,end);
//            }
            start++;
            end--;
        }
    }


    private static void SwapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static void SwapArr2(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int arrmax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
            mx=max(mx,arr[i]);
        return mx;
    }
}
