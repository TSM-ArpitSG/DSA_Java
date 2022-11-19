package arpit.Lecture8BSquestions;

public class Floor_NumberQ2 {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int res = Floor_Number(arr,4);
        System.out.println(res);
    }

     static int Floor_Number(int[] arr, int target) {
        int s = 0;
        int end = arr.length-1;
        // if the target number given is smaller than any number given in the array than no floor number is not possible
        if(target<arr[s])return -1;
        while(s<=end){
            int mid = s +(end-s)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                s = mid+1;
            }
            else
                return arr[mid];

        }
        return end;
    }
}
