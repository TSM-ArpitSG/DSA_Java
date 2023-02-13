package arpit.Lecture11_SortingQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesArray_Q4 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> li = new ArrayList<Integer>();
        cycleSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                li.add(nums[i]);
        }
        System.out.println(li);
    }
    static void cycleSort(int[] arr) {
        int n = arr.length;
        int i=0;
        while (i<n){
            int correctidx = arr[i]-1;
            if(arr[i]!=arr[correctidx])
                swap(arr,i,correctidx);
            else
                i++;
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
