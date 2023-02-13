package arpit.Lecture11_SortingQuestions;

public class TheDuplicate_Q3 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        cycleSort(arr);
        System.out.println(arr[arr.length-1]);
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
