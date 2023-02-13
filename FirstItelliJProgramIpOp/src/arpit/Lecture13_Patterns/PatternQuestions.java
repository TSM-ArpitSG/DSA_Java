package arpit.Lecture13_Patterns;

public class PatternQuestions {
    public static void main(String[] args) {
        //*****     ---> P1
        //*****
        //*****
        //*****
        //*****
        pattern1(5);
        System.out.println();
        //*    ---> P2
        //**
        //***
        //****
        //*****
        pattern2(5);
        System.out.println();
        //*****     ---> P3
        //****
        //***
        //**
        //*
        pattern3(5);
        System.out.println();
        //1         ---> P4
        //12
        //123
        //1234
        //12345
        pattern4(5);
        System.out.println();
        //*    ---> P5
        //**
        //***
        //****
        //*****
        //****
        //***
        //**
        //*
        pattern5(5);
        //   *    ---> P6
        //  * *
        // * * *
        //* * * *
        // * * *
        //  * *
        //   *
        pattern6(5);
        System.out.println();
        //        1         ---> P7
        //      2 1 2
        //    3 2 1 2 3
        //  4 3 2 1 2 3 4
        //5 4 3 2 1 2 3 4 5
        pattern7(5);
        System.out.println();
        //    1         ---> P8
        //   212
        //  32123
        // 4321234
        //543212345
        // 4321234
        //  32123
        //   212
        //    1
        pattern8(5);
        System.out.println();
        //4 4 4 4 4 4 4     ---> P9
        //4 3 3 3 3 3 4
        //4 3 2 2 2 3 4
        //4 3 2 1 2 3 4
        //4 3 2 2 2 3 4
        //4 3 3 3 3 3 4
        //4 4 4 4 4 4 4

        pattern9(4);
    }

    private static void pattern1(int n) {
        //Step 1: the number of lines in the pattern desired.
        for (int i = 1; i <= n; i++) {
        //Step 2: For each rowno. we identify how many columns are there.
            for (int j = 1; j <= n ; j++) {
                //Step 3: Identify the type of element to print.
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern2(int n) {
        //Step 1: the number of lines in the pattern desired.
        for (int i = 1; i <= n; i++) {
            //Step 2: For each rowno. we identify how many columns are there.
            for (int j = 1; j <= i ; j++) {
                //Step 3: Identify the type of element to print.
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern3(int n) {
        //Step 1: the number of lines in the pattern desired.
        for (int i = 1; i <= n; i++) {
            //Step 2: For each rowno. we identify how many columns are there.
            for (int j = 1; j <= n-(i-1) ; j++) {       // right approach.
//            for (int j = n; j >= i ; j--) {           // alternative approach
                //Step 3: Identify the type of element to print.
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern4(int n) {
        //Step 1: the number of lines in the pattern desired.
        for (int i = 1; i <= n; i++) {
            //Step 2: For each rowno. we identify how many columns are there.
            for (int j = 1; j <= i ; j++) {
                //Step 3: Identify the type of element to print.
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private static void pattern5(int n) {
        //Step 1: the number of lines in the pattern desired.
        for (int i = 1; i <= (n*2-1); i++) {
            //Step 2: For each rowno. we identify how many columns are there.
            int c = (i>n)? 2*n-i:i;
            for (int j = 1; j <= c ; j++) {
                //Step 3: Identify the type of element to print.
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern6(int n) {
        //Step 1: the number of lines in the pattern desired.
        for (int i = 1; i <= (n*2-1); i++) {
            //Step 2: For each rowno. we identify how many columns are there.
            int c = (i>n)? 2*n-i:i;
            int spaces = n-c;
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= c ; j++) {
                //Step 3: Identify the type of element to print.
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern7(int n) {
        //Step 1: the number of lines in the pattern desired.
        for (int i = 1; i <= n; i++) {
            int spaces = n-i;
            for (int s = 1; s <= spaces; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print(j+" ");
            }
//            //Step 2: For each rowno. we identify how many columns are there.
//            for (int j = 1; j <= i ; j++) {
//                //Step 3: Identify the type of element to print.
//                System.out.print(j);
//            }
            System.out.println();
        }
    }
    private static void pattern8(int n) {
        //Step 1: the number of lines in the pattern desired.
        for (int i = 1; i <= 2*n-1; i++) {
            int c=i>n?2*n-i:i;
            int spaces = n-c;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int j = c; j >=1 ; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= c ; j++) {
                System.out.print(j);
            }
//            //Step 2: For each rowno. we identify how many columns are there.
//            for (int j = 1; j <= i ; j++) {
//                //Step 3: Identify the type of element to print.
//                System.out.print(j);
//            }
            System.out.println();
        }
    }
    private static void pattern9(int n) {
        //Step 1: the number of lines in the pattern desired.
        for (int i = 1; i < 2*n; i++) {
            //Step 2: For each rowno. we identify how many columns are there.
            for (int j = 1; j < 2*n ; j++) {
                //Step 3: Identify the type of element to print.
                int typeOfElementatIndex = Math.max(Math.abs(i-n),Math.abs(j-n));
                //if (typeOfElementatIndex==0)break;

                System.out.print((typeOfElementatIndex+1)+" ");
            }
            System.out.println();
        }
    }
}
