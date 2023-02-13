package arpit.Lecture12_Strings;

import java.util.Arrays;

public class ThePrintlnfunc {
    public static void main(String[] args) {
        System.out.println(10);
        Integer n = new Integer(10);    // as Integer is a primitive data type it is stored in stack and there is no need for the
                                             // .toString() method to be called explicitly form a wrapper class as the default toString()
                                             // method would give the same value.
        System.out.println(n.toString());   // no need of .toString() as the default one would also give the same value.
        System.out.println("Arpit");
        System.out.println(new int[] {1,2,3,4});
        System.out.println(Arrays.toString(new int[] {1,2,3,4}));
    }
}
