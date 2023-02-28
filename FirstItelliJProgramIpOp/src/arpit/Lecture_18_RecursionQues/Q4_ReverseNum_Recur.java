package arpit.Lecture_18_RecursionQues;

public class Q4_ReverseNum_Recur {
    static int sum=0;
    public static void main(String[] args) {
        // Way 1 : using global variable.
        fun1_Reverse(8536);
        System.out.println(sum);
    }

    private static void fun1_Reverse(int n) {
        if(n==0)
            return;
        sum=sum*10+n%10;
        fun1_Reverse(n/10);
    }
}
