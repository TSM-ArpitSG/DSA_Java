package arpit;

import static java.lang.Math.*;

public class MakePerfectSquare {
    public static void main(String[] args) {
        int n = 53;
        int Addone = MakeSquareone(n);
        int Subone = MaleSquaretwo(n);
        System.out.println(Math.min(Addone,Subone));
    }

    private static int MaleSquaretwo(int n) {
        int steps=0;
        while(!isPerfectSquare(n)){
            steps++;
            n=n+1;
        }
        return steps;
    }


    private static int MakeSquareone(int n) {
        int steps=0;
        while(!(isPerfectSquare(n))){
            steps++;
            n--;
        }
        return steps;
    }
    private static boolean isPerfectSquare(int n) {
//        if(ceil(sqrt(n)) == floor(sqrt(n))) return true;
//        else return false;
        int x = n;
//        System.out.println(sqrt(n));
        if((int)sqrt(n)*(int)sqrt(n)==x)return true;
        else return false;
    }

}
