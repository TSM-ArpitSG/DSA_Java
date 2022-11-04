package arpit.Lecture2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n,num=0
                ;
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();
        for(int i=0;n!=0;i++){
            int lastdigit = n%10;
            num= num*10+lastdigit;
            n=n/10;
        }
        System.out.println(num);
        return;
    }
}
