package arpit.Lecture14_Recursion;

public class Fibbonacci_Q1 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if(n==0||n==1) return n;
        return fibo(n-1)+fibo(n-2);
    }
}
