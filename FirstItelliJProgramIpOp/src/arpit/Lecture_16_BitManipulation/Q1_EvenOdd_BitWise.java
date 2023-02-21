package arpit.Lecture_16_BitManipulation;

public class Q1_EvenOdd_BitWise {
    public static void main(String[] args) {
        boolean ans = isEvenorOdd(11);
        if(ans)
            System.out.println("odd");
        else System.out.println("Even");
    }
    static boolean isEvenorOdd(int n){
        return ((n&1)==1);
    }
}
