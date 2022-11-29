package Assignment_Questions.Lecture1_Flowchart;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a,b));
    }
    static int sum(int a,int b){
        return (a+b);
    }
}
