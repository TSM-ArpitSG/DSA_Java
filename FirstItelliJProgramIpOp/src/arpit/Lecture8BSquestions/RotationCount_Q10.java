package arpit.Lecture8BSquestions;

import static arpit.Lecture8BSquestions.SearchInootated_Q9_Duplicates.FindPivot;

public class RotationCount_Q10 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int pivot = FindPivot(arr);
        if(pivot==-1){
            System.out.println(0);
            return;
        }
        System.out.println(pivot+1);
        return;
    }
}
