package arpit.Lecture_16_BitManipulation;

public class Q14_XorTilla {
    public static void main(String[] args) {
        System.out.println(xor_tillA(9));
    }
    // we follow this pattern because otherwise it would give a TLE for large numbers.
    public static int xor_tillA(int a) {
        if(a%4==0) return a;
        else if(a%4==1) return 1;
        else if(a%4==3) return 0;
        else return a+1;
    }
}
