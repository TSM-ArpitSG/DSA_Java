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
        //putting <=6 or <=faces condition is necessary because if lets says target is 8 in that case the i value would become greater than 6
        //and would be added to our potential list of answers.
        for (int i = 1; i<=6 && i <= target ; i++) {
            ans.addAll(dice_Make_Sum(p+i,target-i));
        }
        return ans;
    }
    //custom number of faces.
    private static ArrayList<String> dice_Make_Sum_faces(String p, int target, int faces) {
        if(target==0){
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i<=faces && i <= target ; i++) {
            ans.addAll(dice_Make_Sum_faces(p+i,target-i,faces));
        }
        return ans;
    }

}
