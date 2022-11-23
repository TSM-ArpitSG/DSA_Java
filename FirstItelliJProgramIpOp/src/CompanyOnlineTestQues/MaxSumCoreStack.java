package CompanyOnlineTestQues;

public class MaxSumCoreStack {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        int maxSum = 7;
        System.out.println(maximumToys(arr,maxSum));
    }

    private static int maximumToys(int[] arr, int maxSum) {
        int c=Integer.MIN_VALUE;
        int count=0;
        int curSum=0;
        for(int i=0;i<arr.length;){
            if(curSum+arr[i]<=maxSum){
                curSum+=arr[i];
                count++;
                i++;
                c=Math.max(c,count);
            }
            else{
                count=0;
                curSum=0;
            }
        }
        return c;
    }
}
