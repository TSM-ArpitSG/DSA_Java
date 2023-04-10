package arpit.Lecture_21_MergeSort;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        merge_sort_inplace(arr,0,4);
        System.out.println(Arrays.toString(arr));
//        int[] ans=merge_sort(arr);
//        System.out.println(Arrays.toString(arr));   // original array is not being modified.
//        System.out.print(Arrays.toString(ans));
    }

    private static int[] merge_sort(int[] arr) {
        if(arr.length==1)
            return arr;
        int mid = arr.length/2;
        int[] left = merge_sort(Arrays.copyOfRange(arr,0,mid));//mid would be exclusive.
        int[] right = merge_sort(Arrays.copyOfRange(arr,mid,arr.length));//till arr.length-1 index
        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int arr[] = new int[first.length + second.length];
        int i=0,j= 0,k=0;
        while(i< first.length&&j< second.length){
            if(first[i]<second[j])
                arr[k++]=first[i++];
            else
                arr[k++]=second[j++];
        }
        while(i< first.length)
            arr[k++]=first[i++];
        while(j<second.length)
            arr[k++]=second[j++];
        return arr;
    }

    private static void merge_sort_inplace(int[] arr, int s, int e) {
        if(e-s==1)
            return;
        int mid = (s+e)/2;
        merge_sort_inplace(arr,s,mid);
        merge_sort_inplace(arr,mid,e);
        merge2(arr,s,mid,e);
    }

    private static void merge2(int[] arr, int s, int mid, int e) {
//        int n = mid;
//        int m = e-mid;
        int[] new_arr = new int[e-s];
        int k=0;
        int i=s,j=mid;
        while(i<mid&&j<e){
            if(arr[i]<arr[j])
                new_arr[k++]=arr[i++];
            else
                new_arr[k++]=arr[j++];
        }
        while(i<mid)
            new_arr[k++]=arr[i++];
        while(j<e)
            new_arr[k++]=arr[j++];
        for(int l = 0; l<new_arr.length; l++){
         arr[s+l]=new_arr[l];
         }
    }
}
