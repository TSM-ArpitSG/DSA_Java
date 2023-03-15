package arpit.Lecture_19_AdvanceRecur;

import java.util.ArrayList;
import java.util.List;

public class Q3_findAllindexes_Recur {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,18,9};
        ArrayList<Integer> yo = new ArrayList<>();
        System.out.println(find_Allindexes(arr,18,0,yo));
    }

    private static List find_Allindexes(int[] arr, int target, int i, ArrayList<Integer> yo) {
        if(i==arr.length)
            return yo;
        else if(arr[i]==target)
            yo.add(i);
        return find_Allindexes(arr,target,i+1,yo);
    }
}
