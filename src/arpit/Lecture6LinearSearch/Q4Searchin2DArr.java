package arpit.Lecture6LinearSearch;

import java.util.Arrays;

public class Q4Searchin2DArr {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},
                        {8,7,3,1,},
                        {10,11,21}};
        System.out.println("Element found at Index: "+ Arrays.toString(LinearSearch2dArr2(arr,11)));

    }

    private static String LinearSearch2dArr(int[][] arr, int x) {
        String ans = "-1";
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==x){
                    ans = i+","+j;
                }
            }
        }
        return ans;
    }
    private static int[] LinearSearch2dArr2(int[][] arr, int x) {
        int[] ans = {-1,-1};
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==x){
                    ans =new int[]{i,j};
                }
            }
        }
        return ans;
    }
}
