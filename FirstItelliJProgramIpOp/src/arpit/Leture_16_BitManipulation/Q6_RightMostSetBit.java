package arpit.Leture_16_BitManipulation;

public class Q6_RightMostSetBit {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(rightMostSet(a));
    }

    private static int rightMostSet(int a) {
        return (a&-a);
    }
    // 00001010   --->10
    // 11110111   --->-10
    //&----------
    // 00000010   --->2
}
