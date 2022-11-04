package arpit.Lecture4;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //Q1: Prime Number
//        int n = sc.nextInt();
//        if(isPrime(n)){
//            System.out.println("Number is Prime");
//        }else
            System.out.println("Number in Not Prime");
        //Q2: Find all 3 Digits Armstrong Number:
        Armstrong3();
    }

    static void Armstrong3() {
        int c=0; //number of 3 digits armstrong number

        for(int i=100;i<=999;i++){
            int sum=0;
            int n= i;
            int count3=3;
            while(count3!=0) {
                int digit = n % 10;
                n = n / 10;
                sum=sum+digit*digit*digit;
                count3--;
            }

            if(sum==i){
                System.out.print(i+" ");
                c++;
            }
        }
        System.out.println("Total number of 3 digit armstrongs are :"+ c);
    }

    static boolean isPrime(int n) {
        if(n<=1)
            return false;
        boolean check = true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                check = false;
                break;
            }
        }

        return check;
    }
}
