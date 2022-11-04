package arpit.Lecture7BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={2,4,6,8,9,12,14,16};
        int res = Binarysearch(arr,9);
        System.out.println(res);
    }
    static int Binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length;
//        int mid = (start+end)/2;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }
            else return mid;
        }
        return -1;
    }
}
