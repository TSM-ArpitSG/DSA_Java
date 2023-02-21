package arpit.Lecture_17_MathforDSA;

public class CheckPrimeNum {
    public static void main(String[] args) {
        System.out.println(is_Prime2(2));
    }

    private static boolean is_Prime(int n) {        // TC: O(n).
        if(n<=1)
            return false;
        for (int i = 2; i <n ; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    // Optimized Approach : run loop till sqrt(n)   // TC: O(sqrt(n)).
    public static boolean is_Prime2(int n) {        // TC: O(n).
        if(n<=1)
            return false;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {   //i*i<=n.
            if(n%i==0)
                return false;
        }
        return true;
    }

    // i<sqrt(n) ---> i*i=n ---> same
    // just sent the under-root of n to left hand side and it becomes square of i.
}
