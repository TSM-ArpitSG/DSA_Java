package arpit.Lecture_17_MathforDSA;

import static arpit.Lecture_17_MathforDSA.Q5_EucledianAlgo_GCD.gcd;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(2,3));
    }

    private static int lcm(int a, int b) {
        int d = gcd(a,b);
        return (a*b)/d;
    }
}
