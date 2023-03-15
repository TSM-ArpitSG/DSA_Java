package arpit.Lecture_19_AdvanceRecur;

public class Q2_LinearSearch_Recur {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,18,9};
        System.out.println(linear_SearchRecr(arr,18,0));
        System.out.println(linear_SearchRecrLast(arr,18, arr.length-1));
    }

    private static int linear_SearchRecr(int[] arr, int target, int i) {
        if(i==arr.length)
            return -1;
        else if(arr[i]==target)
            return i;
        else
            return linear_SearchRecr(arr,target,i+1);
    }
    private static int linear_SearchRecrLast(int[] arr, int target, int i) {
        if(i==-1)
            return -1;
        else if(arr[i]==target)
            return i;
        else
            return linear_SearchRecrLast(arr,target,i-1);
    }
}
