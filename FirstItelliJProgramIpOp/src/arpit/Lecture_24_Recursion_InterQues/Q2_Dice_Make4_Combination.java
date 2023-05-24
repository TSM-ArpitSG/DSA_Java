package arpit.Lecture_24_Recursion_InterQues;

import java.util.ArrayList;

public class Q2_Dice_Make4_Combination {
    public static void main(String[] args) {
        System.out.println(dice_Make_Sum("",4));
    }

    private static ArrayList<String> dice_Make_Sum(String p, int target) {
        if(target==0){
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= target ; i++) {
            ans.addAll(dice_Make_Sum(p+i,target-i));
        }
        return ans;
    }
}
