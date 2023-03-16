package arpit.Lecture_19_AdvanceRecur;

public class Q6_Rotated_BS_Recur {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(rotatedBS_Recur(arr,0,arr.length-1,0));
    }

    private static int rotatedBS_Recur(int[] arr, int s, int e, int key) {
        int mid = s+(e-s)/2;
        if(s>e)
            return -1;
        if(arr[mid]==key)
            return mid;
        if(arr[s]<arr[mid])
            if(key<arr[mid]&&key>=arr[s])
                return rotatedBS_Recur(arr,s,mid-1,key);
            else
                return rotatedBS_Recur(arr,mid+1,e,key);
        else
            if(key>arr[mid]&&key<=arr[e])
                return rotatedBS_Recur(arr,mid+1,e,key);
            else
                return rotatedBS_Recur(arr,s,mid-1,key);
    }
}
