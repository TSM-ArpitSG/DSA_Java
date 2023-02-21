package arpit.Lecture_16_BitManipulation;

public class Q8_MagicNumber {
    public static void main(String[] args) {
        System.out.println(magicNumber(2));
    }

    private static int magicNumber(int n) {
        int ans=0;
        int base = 5;
        while(n!=0){
            int lastbit=n&1;
            ans=ans+(base*lastbit);
            n=n>>1;
            base=base*5;
        }
        return ans;
    }
}
