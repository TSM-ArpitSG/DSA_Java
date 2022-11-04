package arpit.Lecture8BSquestions;

public class InfiniteArraySearch_Q5 {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7,8,10,11,12,15,20,23,30,23};
        System.out.println(Ans(arr,15));
    }

    private static int Ans(int[] arr, int target) {
    int start = 0;
    int end = 1;
    int size=2;
        while(target>arr[end]){
            start=end+1;
            end=end+size*2;
            size=size*2;
        }
        return(BinarySearch(arr,target,start,end));
    }

    private static int BinarySearch(int[] arr, int target,int s,int end) {
        int ans =-1;
        while(s<=end){
            int mid = s +(end-s)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                s = mid+1;
            }
            else
                return mid;

        }
        return ans;
    }
}
