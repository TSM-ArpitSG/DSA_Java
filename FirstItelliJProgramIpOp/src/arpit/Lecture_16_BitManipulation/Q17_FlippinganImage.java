package arpit.Lecture_16_BitManipulation;

import java.util.Arrays;

public class Q17_FlippinganImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        for (int i = 0; i < image.length; i++) {
            reverse_Invert(image[i]);
        }
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
    }

    private static void reverse_Invert(int[] arr) {
        int n =arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for (int i = 0; i < n; i++) {
            arr[i]^=1;
        }
    }
}
