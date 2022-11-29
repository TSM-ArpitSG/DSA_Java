package Assignment_Questions.Lecture1_Flowchart;

import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("HCF of ("+a+","+b+") is : "+ HCF(a,b));
    }

    private static int HCF(int a, int b) {
        // Approach 1 using Loops: TC-->O(min(a,b))
//        for(int i=Math.min(a,b);i>=1;i--){
//            if(a%i==0 && b%i==0){
//                return i;
//            }
//        }
//        return -1;          //invalid input like negative numbers etc.
//    }
        // Approach 2 using Loops: TC-->O(1) constant
        //Approach 2 using while loop with 2 number HCF trick (Divisor and Remainder).
        // works for only 2 numbers --> TC : constant O(1) as the number of steps are not dependent on input
//        int smallerVal = Math.min(a,b);
//        int largerVal = Math.max(a,b);
//        while(largerVal%smallerVal!=0){
//            int temp = largerVal;
//            largerVal = smallerVal;  //(prev divisor is  the smaller number)
//            smallerVal = temp%smallerVal;
//        }
//        return smallerVal;

        //Approach 2 Using Recursion:
//        if(a%b==0)return b;
//        else if(b%a==0)return a;
//        if(a>b)return HCF(b,a%b);
//        else return HCF(a,b%a);
        if(a%b==0)return b;
        return HCF(b,a%b);
    }
}
