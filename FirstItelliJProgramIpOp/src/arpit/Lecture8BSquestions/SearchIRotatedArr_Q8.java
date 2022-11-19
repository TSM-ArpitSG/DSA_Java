package arpit.Lecture8BSquestions;

import arpit.Lecture7BinarySearch.BinarySearch;

public class SearchIRotatedArr_Q8 {
    public static void main(String[] args) {
        int[] Rarr = {3,4,5,6,7,0,1,2};
        int pivot = FindPivot(Rarr);
        int ans = BinarySearch.Binarysearch(Rarr,8,0,pivot);
        if(ans==-1)
            ans = BinarySearch.Binarysearch(Rarr,8,pivot+1,Rarr.length-1);
        System.out.println(ans);
        //Another Approach
        // we know that if pivot =-1 then the array is not rotated hence we perform normal BS
        // int ans = BinarySearch.Binarysearch(Rarr,target,0,Rarr.length-1);
        // else we check 3 conditions:
        // if(target == Rarr[pivot])return pivot;
        //else if(Rarr[0]<target)return BS(arr,target,0,pivot-1);
        //else return BS(arr,target,pivot+1,Rarr.length-1);
    }

    public static int FindPivot(int[] rarr) {
        int s = 0;
        int e = rarr.length-1;
        while(s!=e){
            int mid = s+(e-s)/2;
            if(rarr[mid]>rarr[mid+1])return mid;
            else if(rarr[mid-1]>rarr[mid])return mid-1;
            else if(rarr[s]<rarr[mid])s=mid+1;
            else e=mid-1;
        }
        return s;
    }

}
