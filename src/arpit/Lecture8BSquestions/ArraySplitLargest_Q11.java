package arpit.Lecture8BSquestions;

public class ArraySplitLargest_Q11 {
    public static void main(String[] args) {
        int arr[] = {7,2,5,8,10};
        int k=2;
        System.out.println(Arraysplit(arr,k));
    }

    private static int Arraysplit(int[] arr, int k) {
        int minAns=Integer.MIN_VALUE; //max element of the array
        //when the number of partitions is equal to n, k=arr.length
        for(int i=0;i<arr.length;i++)minAns=Math.max(arr[i],minAns);
        int maxAns=0;
        //when the number of partitions is one i.e. k=1
        for(int i=0;i<arr.length;i++)maxAns+=arr[i];
        return(BS(arr,minAns,maxAns,k));

    }

    private static int BS(int[] arr, int s, int e,int k) {
        while(s!=e){
            int mid = s+(e-s)/2;
            int pieces = findPieces(arr,mid);
            if(pieces<=k)e=mid;
            else
                s=mid+1;
        }
        return s;
    }

    private static int findPieces(int[] arr, int mid) {
        int sum=0;
        int pieces=1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=mid){
                sum+=arr[i];
            }
            else{
                pieces++;
                sum=arr[i];
            }
        }
        return pieces;
    }
}
