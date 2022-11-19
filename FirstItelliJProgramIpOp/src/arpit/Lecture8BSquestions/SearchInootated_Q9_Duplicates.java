package arpit.Lecture8BSquestions;

import arpit.Lecture7BinarySearch.BinarySearch;

public class SearchInootated_Q9_Duplicates {
    public static void main(String[] args) {
        int[] Rarr = {3,4,5,6,6,6,7,0,0,1,2};
        int pivot = FindPivot(Rarr);
        int ans = BinarySearch.Binarysearch(Rarr,0,0,pivot);
        if(ans==-1)
            ans = BinarySearch.Binarysearch(Rarr,0,pivot+1,Rarr.length-1);
        System.out.println(ans);
        //Another Approach
        // we know that if pivot =-1 then the array is not rotated hence we perform normal BS
        // int ans = BinarySearch.Binarysearch(Rarr,target,0,Rarr.length-1);
        // else we check 3 conditions:
        // if(target == Rarr[pivot])return pivot;
        //else if(Rarr[0]<target)return BS(arr,target,0,pivot-1);
        //else return BS(arr,target,pivot+1,Rarr.length-1);
    }

    static int FindPivot(int[] rarr) {

        //Approach 1 : Using maxElement and linear Search find pivot
        // int maxElem = Integer.MIN_VALUE;
        // int ans = 0;
        // for(int i=0;i<rarr.length;i++){
        //     maxElem=Math.max(maxElem,rarr[i]);
        // }
        // for(int i=0;i<rarr.length;i++){
        //     if(rarr[i]==maxElem){
        //         ans=Math.max(ans,i);
        //         break;
        //         }
        // }
        // return ans;


        //Appraoch 2: Using Binary Search:
        int s=0;
        int e=rarr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;

            if(mid<e&&rarr[mid]>rarr[mid+1])return mid;
            else if(mid>s&&rarr[mid-1]>rarr[mid])return mid-1;
            if(rarr[mid]==rarr[e]&&rarr[mid]==rarr[s]){
                if(s<e&&rarr[s]>rarr[s+1])return s;
                s++;
                if(e>0&&rarr[e-1]>rarr[e])return e-1;
                e--;
            }
            else if(rarr[s]<rarr[mid]||(rarr[mid]==rarr[s]&&rarr[mid]>rarr[e]))s=s+1;
            else
                e=e-1;
        }
        return -1;
    }
}
