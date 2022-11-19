package arpit.Lecture9_2DBS;

import java.util.Arrays;

public class BS_2D {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int[] res = BS2d(arr,33);
        System.out.println(Arrays.toString(res));
    }

    private static int[] BS2d(int[][] arr, int target) {
        int lb = 0;
        int ub = arr[0].length-1;
        while (lb<=arr[0].length-1&&ub>=0){
            if(target>arr[lb][ub])lb++;
            else if(target<arr[lb][ub])ub--;
            else
                return new int[]{lb,ub};
        }
        return new int[] {-1,-1};
    }
}
