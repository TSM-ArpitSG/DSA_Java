package arpit.Lecture1;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the temprature in celcius");
        float temp  = sc.nextFloat();
        System.out.println(temp*9/5+32);
    }
}
