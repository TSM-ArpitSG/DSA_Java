package arpit.Lecture11_SortingQuestions;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(FindMissing(arr));
    }

    private static int FindMissing(int[] arr) {
//        //Approach 1: Summantion of n numbers:
//        int n = arr.length;
//        int actualSum = (n*(n+1))/2;
//        int sum=0;
//        for(int i=0;i<n;i++)sum+=arr[i];
//        return (actualSum-sum);
        //Approach 2: Using Cyclic Sort:
        //here we first modify the cyclic sort algorithm to work with 0,n range
        // here we can see that when the array would be sorted than each array element would be at it's correct index
        // the correct index would be the corresponding element itself. i.e. : arr[i]=i;
        // at the we will run a loop to check if(arr[i]+1!=arr[i+1])return arr[i]+1;
        int n = arr.length;
        cycleSort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]+1!=arr[i+1])return arr[i]+1;
        }
        return -1;
    }

    static void cycleSort(int[] arr) {
        // for 0,n range
        int i=0;
        int n =arr.length;
        while(i<n){
            int correctidx = arr[i];
            if(correctidx==n)i++;   //ignore if the index is out of bounds that is correct-index = n
            else if(arr[i]!=arr[correctidx])
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
