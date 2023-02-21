package arpit.Lecture_16_BitManipulation;

public class Q13_NumofSetBits {
    public static void main(String[] args) {
        System.out.println(numSetbits(9));
        System.out.println(Integer.toBinaryString(32));     // used to show the binary representation of any Integer.
    }

    //Brute Force Approach : TC--->O(m) , m--->Number of digits in binary representation of n.
//    private static int numSetbits(int n) {
//        int c=0;
//        while(n!=0){
//            if((n&1)==1)
//                c++;
//            n=n>>1;
//        }
//        return c;
//    }
    // Optimized approach using negative of number find the rightmost set bit and remove it from N. Increment counter by 1 and keeping repeating
    // until n is 0.
    private static int numSetbits(int n) {
        int c=0;
        while(n!=0){
            int rightmostsetbit = n&(n-1);      // with removal of rightmost bit update n.
            n=rightmostsetbit;
            c++;
        }
        return c;
    }
}
