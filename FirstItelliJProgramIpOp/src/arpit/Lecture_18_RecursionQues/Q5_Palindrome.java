package arpit.Lecture_18_RecursionQues;

import static arpit.Lecture_18_RecursionQues.Q4_ReverseNum_Recur.func2_Reverse;

public class Q5_Palindrome {
    static int digits = (int)Math.log10(11)+1;
    public static void main(String[] args) {
        // Way 1: Using normal reverse function.
        System.out.println(is_Palindrome(1234321));
        // Way 2: Using Only palindrome function.
        System.out.println(is_Palindrome2(11));

    }

    private static boolean is_Palindrome2(int n) {

        return helper(n,digits);
    }

    private static boolean helper(int n, int pos) {
        if(digits%2==0){
            if(pos==digits/2)
                return true;
            else if(n/(int)Math.pow(10,pos-1)==n%10)
                return helper(n/10,pos-1);
            else
                return false;
        }
        else {
            if (pos == digits / 2 + 1)
                return true;
            else if (n / (int) Math.pow(10, pos - 1) == n % 10)
                return helper(n / 10, pos - 1);
            else
                return false;
        }
    }

    private static boolean is_Palindrome(int n) {
        if(func2_Reverse(n)==n)
            return true;
        else
            return false;
    }
}
