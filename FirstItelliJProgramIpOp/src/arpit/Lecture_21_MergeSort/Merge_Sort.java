package arpit.Lecture_21_MergeSort;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,7,6};
        arr=merge_sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static int[] merge_sort(int[] arr) {
        if(arr.length==1)
            return arr;
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);//mid would be exclusive.
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
}
//    private static int[] merge_sort(int[] arr, int s, int e) {
//        while(s<e){
//            int mid = s+(e-s)/2;
//             merge_sort(arr,s,mid);
//             merge_sort(arr,mid+1,e);
//            return merge(arr,s,mid,e);
//        }
//        return new int[]{-1};
//    }

//    private static int[] merge(int[] arr, int s, int mid, int e) {
//        int n = mid;
//        int m = e-mid;
//        int[] new_arr = new int[m+n];
//        int k=0;
//        int i=0,j=mid+1;
//        while(i<=n&&j<=e){
//            if(arr[i]<arr[j])
//                new_arr[k++]=arr[i++];
//            else
//                new_arr[k++]=arr[j++];
//        }
//        while(i<=n)
//            new_arr[k++]=arr[i++];
//        while(j<=e)
//            new_arr[k++]=arr[j++];
//        return new_arr;
//    }
//}
