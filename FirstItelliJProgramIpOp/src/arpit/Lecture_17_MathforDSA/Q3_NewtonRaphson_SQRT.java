package arpit.Lecture_17_MathforDSA;

public class Q3_NewtonRaphson_SQRT {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(newton_SQRT(n));
    }
    // Time complexity ---> O(log(n)F(n))
    private static double newton_SQRT(int n) {
        double x=n;
        double root = (x+n/x)/2;
        double error = Math.abs(root-x);
        while(error>=0.5){                                  // the error condition is important as it tells how close the number should be to the actual value.
                                                            // like if >=1 it will give a ans which can have +1 deviation from the actual ans, but in 0.5
                                                            // it will take a ans that is +0.5 of actual ans.
            x=root;
            root = (x+n/x)/2;
            error = Math.abs(root-x);
        }
        return root;
    }
}
