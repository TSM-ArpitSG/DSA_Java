package arpit.Lecture6LinearSearch;

public class Q2SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,43,5,6,78};
        System.out.println("Element at Index: "+LinearSearchArrRange(arr,78,1,3));

    }
    static int LinearSearchArrRange(int[] arr,int x,int start,int end){
        int idx=-1;
        if(arr.length==0)
            return -1;
        for(int i=start;i<=end;i++){
            if(arr[i]==x){
                idx = i;
                break;
            }
        }
        return idx;
    }
}
