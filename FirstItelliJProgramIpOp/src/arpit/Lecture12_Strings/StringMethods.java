package arpit.Lecture12_Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s="Arpit Singh Ms Motu";
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(s.toLowerCase());
        System.out.println("        Arpit Singh           Ms Motu               ".strip());
        System.out.println("        Arpit              Singh Ms Motu          ".trim());
        System.out.println(Arrays.toString(s.split(" ")));
    }
}
