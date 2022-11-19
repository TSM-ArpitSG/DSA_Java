package arpit.Lecture8BSquestions;

public class PeakElementInMountain_Q6 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(PeakElement(arr));
    }

    private static int PeakElement(int[] arr) {
        int s =0;
        int e =arr.length-1;
        while(s!=e){
            int mid = s+(e-s)/2;
            if(arr[mid]<arr[mid+1])
                s=mid+1;
            else if(arr[mid]>arr[mid+1])
                e=mid;
        }
        return s;
    }

}
