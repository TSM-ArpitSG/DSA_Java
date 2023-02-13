package arpit.Lecture11_SortingQuestions;

public class FirstPositiveMissing_Q5 {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        cycleSort(nums);
        // System.out.print(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++)
            if(nums[i]!=i+1) {System.out.println( i+1);return;}
        System.out.println( nums[nums.length-1]+1);
    }
    static void cycleSort(int[] arr){
        int i=0;
        int n = arr.length;
        while(i<n){
            if(arr[i]<1){i++;continue;}
            int correctidx = arr[i]-1;
            //1 and n are inclusive
            if(arr[i]<=n&&arr[i]!=arr[correctidx]){
                swap(arr,i,correctidx);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
