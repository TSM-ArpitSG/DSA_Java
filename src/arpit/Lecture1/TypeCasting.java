package arpit.Lecture1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Implicit Type Casting or Conversion(Widening)
        float num = sc.nextFloat(); // here even if i provide int as input in terminal the value will be converted to float implicit type casting.
        //float num = sc.nextInt(); //similar work just take the next input.
        System.out.println(num);
        //2. Explicit Type Casting or Conversion(Narrowing)
        int a = (int)324.2f;
        System.out.println(a);

        //Automatic Type Promotion in Expressions:
        int n1 = 258;
        byte b = (byte) n1;   // Byte max range is 256 and i am providing 258 hence remainder of 258%256 is stored that is 2.
        System.out.println(b);

        byte e1 = 40;
        byte e2 = 50;
        int e3 = e1*e2/100;     //here e1*e2 is promoted to int type automatically to evaluate the expression and store its value.
        System.out.println(e3);

        //here in this example the byte value is again converted to integer but as its having a type of byte it cannot store integer value
        //therefore showing an error.
//        byte number = 5;
//        number = number*2;  //error as number is converted to integer value during the evaluation of the expression thereby not allowing a integer
        //value to be stored in byte type variable
        int number = 'a';   //a-->97 (ASCII Value)
        System.out.println(number);

        //java follows UNICODE principals,so it supports all types of languages.
        System.out.println("你好");  //it displays hello in chinese

        //rules of type casting in expressions in java
        byte b1 = 42;
        short s = 1024;
        char c = 'a';
        int i =2000;
        float f =22.2f;
        double d =453.3;
        double res = (f*b)+(i/c)+(s*d);
        //float + byte =float +int/char = int +short*double = double
        //the bigger value is used to promote in the expression
        // the final res would be of type double.
        System.out.println((f*b)+" "+(i/c)+" "+(s*d));
        System.out.println(res);
    }
}
