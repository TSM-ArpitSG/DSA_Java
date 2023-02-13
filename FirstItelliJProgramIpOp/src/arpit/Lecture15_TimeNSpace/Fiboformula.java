package arpit.Lecture15_TimeNSpace;

public class Fiboformula {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(FiboFormula(i));
        }
    }

    private static int FiboFormula(int i) {
        return (int)((Math.pow((1+Math.sqrt(5))/2,i)-Math.pow((1-Math.sqrt(5))/2,i))/Math.sqrt(5));
    }
}
