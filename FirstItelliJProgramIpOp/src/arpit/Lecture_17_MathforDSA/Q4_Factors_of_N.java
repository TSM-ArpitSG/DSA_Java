package arpit.Lecture_17_MathforDSA;

import java.util.ArrayList;

public class Q4_Factors_of_N {
    public static void main(String[] args) {
//        factors_N(20);
        factors2_N(20);
    }


    // 1: Brute Force Approach just run a loop for 1 till N. print all the divisors of N.       TC ---> O(n).
    private static void factors_N(int n) {
        for (int i = 1; i <= n; i++) {
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
    // 2: Optimized Approach just run loop till sqrt(N) add a arraylist to keep all factors of N in the form n/i.       TC ---> O(sqrt(n))   SC ---> O(2*sqrt(n))
    private static void factors2_N(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i*i <= (n) ; i++) {
            if(n%i==0){
                if(n/i==i)
                    System.out.print(i+" ");
                else{
                    System.out.print(i+" ");
                    arr.add(n/i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(arr.size()-i-1)+" ");
        }
    }
    private static void factors3_N(int n) {

        for (int i = 1; i*i <= (n) ; i++) {
            if(n%i==0){
                if(n/i==i)
                    System.out.print(i+" ");
                else
                    System.out.print(i+" "+n/i);
            }
        }
    }
}
