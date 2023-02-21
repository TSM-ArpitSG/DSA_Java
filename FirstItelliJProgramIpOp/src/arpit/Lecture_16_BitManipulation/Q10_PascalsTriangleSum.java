package arpit.Lecture_16_BitManipulation;

public class Q10_PascalsTriangleSum {
    static long calculateSum(int n)
    {

        // Initialize sum with 0
        long sum = 0;

        // Calculate 2^n
        sum = 1 << n-1;

        return (sum);
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 10;
        System.out.println("Sum of all elements:"
                + calculateSum(n));
    }
}
