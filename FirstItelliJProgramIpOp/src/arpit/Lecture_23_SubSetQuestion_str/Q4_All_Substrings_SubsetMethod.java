package arpit.Lecture_23_SubSetQuestion_str;

import java.util.ArrayList;

public class Q4_All_Substrings_SubsetMethod {
    public static void main(String[] args) {
        print_Substrings("","abc");
        System.out.println(print_Substrings1("","abc"));
    }

    private static void print_Substrings(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        print_Substrings(p+up.charAt(0),up.substring(1));
        print_Substrings(p,up.substring(1));
    }
    private static ArrayList<String> print_Substrings1(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();         // new arraylist object created each time the up string becomes empty and
                                                                // we put the p string in list and return that list which is called by left first
                                                                // than right and after that we put both the elements together and return the list.
            list.add(p);
            return list;
        }
        ArrayList<String> left = print_Substrings1(p+up.charAt(0),up.substring(1));
        ArrayList<String> right = print_Substrings1(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
