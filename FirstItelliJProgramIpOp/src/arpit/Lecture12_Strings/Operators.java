package arpit.Lecture12_Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'a'); // ASCII value of a -->97;
        System.out.println("Arpit"+" Singh");   // concatenates the two strings
        System.out.println('a'+2);              // converts the char to ASCII value and adds 2 to it.
        System.out.println((char)('a'+2));      // explicit type casting or type conversion.
        System.out.println("a"+1); // 1 is converted into an object of wrapper class Integer so String and .toString() of Integer can be concatenated
                                   // and displayed. it becomes sout("a"+"1");
        // more complex types
        System.out.println("Arpit"+new ArrayList<>());  // here the .toString() of ArrayList class will be called to convert the list to String
                                                        // and then concatenated with "Arpit".
//        System.out.println(new int[]{});
//        System.out.println(1+ new int[] {});        // error because either both should be primitive or one should be String.
        System.out.println(new Integer(12)+""+new ArrayList<>());  // one string object present in the expression.
    }
}
