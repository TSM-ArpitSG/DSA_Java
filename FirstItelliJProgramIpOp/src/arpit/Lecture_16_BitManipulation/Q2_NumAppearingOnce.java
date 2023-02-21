package arpit.Lecture_16_BitManipulation;

public class Q2_NumAppearingOnce {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,3,2,6,4,1};
        System.out.println(one_numinArr(arr));
    }

    private static int one_numinArr(int[] arr) {
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=ans^arr[i];
        }
        return ans;
    }
}
