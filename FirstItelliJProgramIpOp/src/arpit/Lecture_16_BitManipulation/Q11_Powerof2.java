package arpit.Lecture_16_BitManipulation;

public class Q11_Powerof2 {
    public static void main(String[] args) {
        System.out.println(powof2(33));
    }

//    private static boolean powof2(int n) {
//        if((n&1)==1)return false;
//        else{
//            int c=0;
//            while(n!=0){
//                int ld = n&1;
//                if(ld==1)c++;
//                n=n>>1;
//            }
//            return c == 1;
//        }
//    }
    private static boolean powof2(int n) {
        //exceptional case when n=0
        if(n==0)return false;
        return ((n&(n-1))==0);
    }
}
