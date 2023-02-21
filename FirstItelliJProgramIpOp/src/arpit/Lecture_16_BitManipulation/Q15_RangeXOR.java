package arpit.Lecture_16_BitManipulation;

import static arpit.Lecture_16_BitManipulation.Q14_XorTilla.xor_tillA;

public class Q15_RangeXOR {
    public static void main(String[] args) {
        System.out.println(range_XOR(3,9));
    }

    private static int range_XOR(int a, int b) {
        return xor_tillA(b)^xor_tillA(a-1);
    }
}
