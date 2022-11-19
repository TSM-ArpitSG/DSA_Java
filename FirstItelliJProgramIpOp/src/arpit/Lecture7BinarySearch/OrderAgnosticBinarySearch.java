package arpit.Lecture7BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr ={2,4,6,8,9,12,14,16};
        int[] arr={90,80,30,40,10,0,-20,10};
        int res;
        if(arr[0]<arr[arr.length-1])
         res = AscendingBinarysearch(arr,9);
        else
         res = DescendingBinarysearch(arr,10);
        System.out.println(res);
    }
    static int AscendingBinarysearch(int[] arr,int target){
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

    static int DescendingBinarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length;
//        int mid = (start+end)/2;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target>arr[mid]){
                end = mid-1;
            } else if (target<arr[mid]) {
                start = mid+1;
            }
            else return mid;
        }
        return -1;
    }

}
