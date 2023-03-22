package arpit.Lecture20_Pattern_Recur;
//n==4
//* * * *
//* * *
//* *
//*
// p2 :
//n==4
//*
//* *
//* * *
//* * * *

public class pattern1_Recur {
    public static void main(String[] args) {
        pattern2_rec(5,1);
    }

    private static void pattern1_rec(int n,int i) {
        if(n==0)
            return;
        else if(n==i){
            System.out.println("*");
            pattern1_rec(n-1,1);
        }
        else if(i<n){
            System.out.print("* ");
            pattern1_rec(n,i+1);
        }
    }
    private static void pattern2_rec(int r,int c) {
        if(r==0)
            return;
        if(c>r){
            pattern2_rec(r-1,1);
            System.out.println();
        }
        else if(c<=r){
            pattern2_rec(r,c+1);
            System.out.print("* ");
        }
    }
}
