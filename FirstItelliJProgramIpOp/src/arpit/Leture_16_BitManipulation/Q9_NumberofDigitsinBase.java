package arpit.Leture_16_BitManipulation;

public class Q9_NumberofDigitsinBase {
    public static void main(String[] args) {
        int num = 10;
        int base=2;
        System.out.println((int)(Math.log(num)/Math.log(base))+1);      // TC: O(log n)
//        System.out.println(count_Digits(10));
    }
    // Brute force Approach : O(n) TC
//    static int count_Digits(int n){
//        int c=0;
//        while(n!=0){
//            c++;
//            n=n>>1;
//        }
//        return c;
//    }
}
