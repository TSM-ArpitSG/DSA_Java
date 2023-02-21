package arpit.Lecture_17_MathforDSA;

import static arpit.Lecture_17_MathforDSA.CheckPrimeNum.is_Prime2;

public class Q1_PrimetillN {
    public static void main(String[] args) {
        int n = 40;
//        primeTill_N(n);
        sieve_Method(n);
    }
    // 1: Brute force Approach ---> Run a for loop from 2 to N and check each number if prime or not   // TC: O(n*(sqrt(n))
    private static void primeTill_N(int n) {
        for (int i = 2; i <=n ; i++) {
            if(is_Prime2(i))
                System.out.print(i+" ");
        }
    }

    // 2: Optimized Approach ---> Mark the multiples of prime numbers as false so they are not checked individually. // TC: O(nlog(log(n)))
    // Sieve Method
    private static void sieve_Method(int n) {
        boolean[] check = new boolean[n+1];
        for (int i = 2; i <=n ; i++) {
            check[i]=true;
        }
        for (int i = 2; i*i <= n ; i++) {
            if(check[i] && is_Prime2(i)){
                for (int j = 2; j*i <= n ; j++) {
                    check[i*j]=false;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(check[i])
                System.out.print(i+" ");
        }
    }

}
