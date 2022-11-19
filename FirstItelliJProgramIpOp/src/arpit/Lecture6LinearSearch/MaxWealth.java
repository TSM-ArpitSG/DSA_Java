package arpit.Lecture6LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int arr[][]={{1,5},{7,3},{3,5}};
        System.out.println(MaxWealthcal(arr));
    }

    private static int MaxWealthcal(int[][] arr) {
        int maxW = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) sum += anInt;
            maxW = Math.max(maxW, sum);
        }
        return maxW;
    }
}
