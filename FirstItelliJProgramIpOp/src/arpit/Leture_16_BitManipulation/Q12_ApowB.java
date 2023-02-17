package arpit.Leture_16_BitManipulation;

public class Q12_ApowB {
    public static void main(String[] args) {
        System.out.println(AraisePowB(3,6));
    }

    private static int AraisePowB(int base, int power) {        // O(log(base)) ---> TC
        int ans=1;
        while(power!=0){
            int lb=power&1;
            if(lb==1)
                ans=ans*base;
            base=base*base;
            power=power>>1;
        }
        return ans;
    }
//    private static int AraisePowB(int base, int power) {        // O(base) ---> TC
//        int ans=1;
//        while(power!=0){
//            ans=ans*base;
//            power--;
//        }
//        return ans;
//    }
}
