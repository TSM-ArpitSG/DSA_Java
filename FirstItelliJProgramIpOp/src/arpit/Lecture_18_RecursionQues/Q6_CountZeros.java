package arpit.Lecture_18_RecursionQues;

public class Q6_CountZeros {
    public static void main(String[] args) {
        System.out.println(count_Zeros(30001));
    }

    private static int count_Zeros(int n) {
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n==0)
            return c;
        if(n%10==0)
            return helper(n/10,c+1);
        else
            return helper(n/10,c);
    }

}
