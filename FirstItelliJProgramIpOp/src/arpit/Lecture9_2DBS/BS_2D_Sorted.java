package arpit.Lecture9_2DBS;

import java.util.Arrays;

public class BS_2D_Sorted {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};     //strictly sorted
        int res[] = BS2d_sorted(arr,3);
        System.out.println(Arrays.toString(res));
    }

    private static int[] BS2d_sorted(int[][] arr, int target) {
        int rows= arr.length;;
        int cols = arr[0].length;
        //empty 2d array
        if(cols==0){
            return new int[] {-1,-1};
        }
        //if only 1 row
        if(rows==1){
            return Bs2dinrange(arr,target,0,0,cols-1);
        }
        int rs = 0;
        int re = rows-1;
        int cmid = cols/2;
        //until 2 rows
        while(rs<(re-1)){
            int mid = rs+(re-rs)/2;
            if(target>arr[mid][cmid])rs=mid;    //ignore rows before current element
            else if(target<arr[mid][cmid])re=mid;   //ignore rows after current element
            else
                return new int[]{mid,cmid};
        }
        // if target not found it means only 2 rows remain hence we search in the remaining 2 rows.
        // 1st in the middle column
        if(target==arr[rs][cmid])
            return new int[]{rs,cmid};
        else if(target==arr[rs+1][cmid])
            return new int[]{rs+1,cmid};
        else{
            if(target>arr[rs][cmid]){
                //go to RHS in the 1st row
                return Bs2dinrange(arr,target,rs,cmid+1,arr[rs].length-1);
            }
            else if(target<arr[rs][cmid]){
                //go to LHS in the 1st row
                return Bs2dinrange(arr,target,rs,0,cmid-1);
            }
            else if(target>arr[rs+1][cmid]){
                //go to RHS in the 2nd row
                return Bs2dinrange(arr,target,rs+1,cmid+1,arr[rs+1].length-1);
            }
            else{
                //go to LHS in the 2nd row
                return Bs2dinrange(arr,target,rs+1,0,cmid-1);
            }
        }
    }

    private static int[] Bs2dinrange(int[][] arr, int target, int row, int s, int e) {
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target<arr[s][e])
                s=mid+1;
            else if(target>arr[s][e])
                e=mid-1;
            else
                return new int[]{s,e};
        }
        return new int[] {-1,-1};
    }

}
