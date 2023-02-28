package arpit.Lecture_18_RecursionQues;

public class Q3_SumNProd_Digits {
    public static void main(String[] args) {
        System.out.println(sum_digits(1343));
        System.out.println(prod_digits(1343));
    }

    private static int prod_digits(int n) {
        if (n%10 == n)
            //if(n==0)      does not work when number has 0 as digit 0. ex:809
            return n;
        return n % 10 * sum_digits(n / 10);
    }

    private static int sum_digits(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sum_digits(n / 10);
    }
}
