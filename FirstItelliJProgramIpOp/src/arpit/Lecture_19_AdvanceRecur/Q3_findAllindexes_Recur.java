package arpit.Lecture_19_AdvanceRecur;

import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collections;

public class Q3_findAllindexes_Recur {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,18,9};
        ArrayList<Integer> yo = new ArrayList<>();
//        System.out.println(find_Allindexes(arr,18,0,yo));
        System.out.println(find_Allindexes2(arr,18,0));
    }

    //Approach 1: Using list as an argument in the function same object different reference variables.
    private static List find_Allindexes(int[] arr, int target, int i, ArrayList<Integer> yo) {
        if(i==arr.length)
            return yo;
        else if(arr[i]==target)
            yo.add(i);
        return find_Allindexes(arr,target,i+1,yo);
    }

    //Approach 2: Using list in the body of function different objects different refrence variables.
    private static ArrayList find_Allindexes2(int[] arr, int target, int i) {
        ArrayList<Integer> yo = new ArrayList<>();
        if(i==arr.length)
            return yo;
        // this will contain answer for that funtion only
        else if(arr[i]==target)
            yo.add(i);
        ArrayList<Integer> elementsfrombelowfunctioncalls = find_Allindexes2(arr,target,i+1);   // the functions will come out here and resume
                                                                                                  // execution here.
        yo.addAll(elementsfrombelowfunctioncalls);      // lists merged
        return yo;          // return the list.
    }
}
