package arpit.Lecture_18_RecursionQues;

public class Q4_ReverseNum_Recur {
    static int sum=0;
    public static void main(String[] args) {
        // Way 1 : using global variable.
//        fun1_Reverse(8536);
//        System.out.println(sum);
        // Way 2 : using Pure Recursion only
        System.out.println(func2_Reverse(1234));
    }

    public static int func2_Reverse(int n) {
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }

    private static int helper(int n, int pow) {
        if(n==0)
            return 0;
        int rem = n%10;
        return rem*(int)Math.pow(10,pow-1)+helper(n/10,pow-1);
    }

    private static void fun1_Reverse(int n) {
        if(n==0)
            return;
        sum=sum*10+n%10;
        fun1_Reverse(n/10);
    }
}
