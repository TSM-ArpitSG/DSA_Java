package arpit.Lecture_18_RecursionQues;

public class Q2_Factorial {
    public static void main(String[] args) {
        // not considering negative numbers.
        System.out.println(fact(5));
        System.out.println(sum_n(0));

    }


    private static int sum_n(int n) {
        if(n<=1)
            return n;
        return n+sum_n(n-1);
    }


    private static int fact(int n) {
        if(n<=1)
            return 1;
        return n*fact(n-1);
    }
}
