package arpit.Lecture2;

import java.util.Scanner;

public class LoopsandConditions {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Q1: Largest of 3 Numbers:
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        int max = a;
//        if(max<b)max=b;
//        if(max<c)max=c;
//        System.out.println(max);
    //Q2: Check if character is uppercase or lowercase
//        char ch = sc.next().trim().charAt(0);       //here trim removes any spaces that might be there in the input and charAt() converts string to char
//                                                    // as there are no predefined methods for taking a char as input we convert string to char.
//        if(ch>='a'&&ch<='z'){                     // here the char is converted to int value via automatic type conversion in expression in java.
//            System.out.println("Lowercase");
//        }
//        else{
//            System.out.println("Uppercase");
//        }
    //Q3: Fibonacci series
        //0 1 1 2 3 5 8 .....
//        int n = sc.nextInt();
//        int n1 = 0;
//        int n2 = 1;
//        int n3 = n1+n2;
//        int c=0;
//        if(n==0||n==1) {System.out.println(n);return;}
//        while(n-2!=0){
//            //System.out.print(n3+" ");
//            n1=n2;
//            n2=n3;
//            n3=n1+n2;
//            n--;
//        }
//        System.out.println(n3);
    //Q4: Count the occurrence(1385757879) of a particular digit(7) in a given number.
        int num = sc.nextInt();
        int c=0;
        while(num!=0){
            int lastdigit = num%10;
            num=num/10;     // here it only takes the integer part of the number ex: 1385757879/10 = 138575787.9. "0.9" is neglected
            if(lastdigit==7)
                c++;
        }
        System.out.println(c);
    }
}
