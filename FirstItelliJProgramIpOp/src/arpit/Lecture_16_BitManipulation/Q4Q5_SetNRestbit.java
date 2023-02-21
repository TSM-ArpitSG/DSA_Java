package arpit.Lecture_16_BitManipulation;

public class Q4Q5_SetNRestbit {
    public static void main(String[] args) {

        System.out.println(setBit(86,4));
        System.out.println(resetBit(86,2));
    }
// 86 --> 1010110
    private static int resetBit(int n, int i) {
        int mask = 1<<i-1;
        return(n&~(mask));
    }

    private static int setBit(int n, int i) {
        int mask = 1<<(i-1);
        int ans = n|mask;

        return ans;
    }

}
