package arpit.Lecture_16_BitManipulation;

public class Q3_ithBitNum {
    public static void main(String[] args) {
        System.out.println(NthBit(10110110,5));
    }

    private static int NthBit(int n,int i) {
        return (n&(1<<i-1));
    }
}
// 16 --> 00010000
