package arpit.Lecture_23_SubSetQuestion_str;

import java.util.ArrayList;
import java.util.List;

public class Q6_All_Subsets {
    public static void main(String[] args) {
        System.out.println(all_subsets(new int[] {1,2}));
    }

    private static List<List<Integer>> all_subsets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int elem : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(elem);
                outer.add(internal);
            }
        }
        return outer;
    }
}
