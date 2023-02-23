package arpit.Lecture_17_MathforDSA;

public class Q5_EucledianAlgo_GCD {
    public static void main(String[] args) {
        System.out.println(gcd(40,12));
    }

    public static int gcd(int a, int b) {
        if(a==0)
            return b;
        return (gcd(b%a,a));
    }
}
