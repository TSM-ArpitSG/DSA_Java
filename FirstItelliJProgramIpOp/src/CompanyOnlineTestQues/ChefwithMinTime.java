package CompanyOnlineTestQues;

import java.util.Arrays;
import java.util.Scanner;

public class ChefwithMinTime {
    /*There are 2 chefs who can cook dish A. The time T taken by both of them are 4 and 2. Thus, the minimum time
required to prepare dish A is 2.
There are 2 chefs who can cook dish B. The time T taken by both of them are 3 and 5. Thus, the minimum time
required to prepare dish B is 3.
Thus, minimum time required to prepare both dish A and B separately is 2+3 = 5.
Now, There are 2 chefs who can cook both dishes A and B. The time T taken by both of them are 8 and 10. Thus, the
minimum time required to prepare both dish A and B by chefs of type C is 8, which is more than time taken to
prepare dish A and B separately. Thus, 5 is the output.

Q2. Max is on a quest to collect gold coins. He has come across a series of open crates which are filled with gold
coins each of varying quantities. He is free to collect the coins from any crate, however as soon as he collects the
coins from one crate, the crates before and after that particular crate vanish, which means he can no longer collect
the coins from both of those crates.
Given a series of N crates and C numbers of gold coins inside each of them, write a program to help Max collect the
maximum number M of gold coins.
Read the input from STDIN (standard input) and write the output to STDOUT (standard output). Do not print any
arbitrary strings while reading the input or printing the output as those would contribute to STDOUT.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];
//        char[] chef = new char[n];
        String chef="";
        for(int i=0;i<n;i++){
            chef+=sc.next();
            time[i]=sc.nextInt();
        }
        System.out.println(chef);
        System.out.println(Arrays.toString(time));
        int minA=Integer.MAX_VALUE,minB=Integer.MAX_VALUE,minC=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(chef.charAt(i)=='A')minA=Math.min(minA,time[i]);
            else if(chef.charAt(i)=='B')minB=Math.min(minB,time[i]);
            else if(chef.charAt(i)=='C')minC=Math.min(minC,time[i]);
        }
        int minAB=minA+minB;
        System.out.println(Math.min(minAB,minC));
    }
}
