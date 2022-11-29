package Assignment_Questions.Lecture1_Flowchart;

import java.util.Scanner;

public class TakeInputUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String check=sc.next();
        int sum=0;
//        System.out.println(Objects.equals('x','x'));
       do{
            String c = sc.next();
            if(c.equals("x"))break;
            sum+=Integer.parseInt(c);

        } while(true);
        System.out.println(sum);


    }
}
