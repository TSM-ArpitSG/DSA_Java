package Assignment_Questions.Lecture1_Flowchart;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Please Enter A Year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(leapYear(year));
    }

    private static boolean leapYear(int year) {
        if(year%400==0)return true;
        else if(year%100==0)return false;
        return year % 4 == 0;
    }
}
