package arpit.Lecture8BSquestions;

public class FirstandLastPos_Q4 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int first_ocurrence = BS1st(arr,1);
        int last_occurrence = BS2nd(arr,1);
        System.out.println("["+first_ocurrence+","+last_occurrence+"]");
    }

    private static int BS1st(int[] arr, int target) {
        int ans = -1;
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target<arr[mid])
                e=mid-1;
            else if(target>arr[mid])
                s=mid+1;
            else{
                ans = mid;
                e=mid-1;
            }
        }
    return ans;
    }
    private static int BS2nd(int[] arr, int target) {
        int ans = -1;
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target<arr[mid])
                e=mid-1;
            else if(target>arr[mid])
                s=mid+1;
            else{
                ans = mid;
                s=mid+1;
            }
        }
        return ans;
    }

}
