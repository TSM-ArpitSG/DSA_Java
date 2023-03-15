package arpit.Lecture_19_AdvanceRecur;

public class Q1_SortedArr {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,9};
        System.out.println(is_Sorted(arr,0));
    }

    private static boolean is_Sorted(int[] arr,int i) {
        if(i==arr.length-1)
            return true;
        else if(arr[i]>arr[i+1])
            return false;
        return is_Sorted(arr,i+1);
    }
}
