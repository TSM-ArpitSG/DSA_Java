package arpit.Lecture_23_SubSetQuestion_str;

import java.util.ArrayList;

public class Q5_Subsequences_Ascii {
    public static void main(String[] args) {
        print_Subseq_Ascii("","ab");
        System.out.println(print_Subseq_Ascii_Ret("","ab"));
    }

    private static ArrayList<String> print_Subseq_Ascii_Ret(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();         // new arraylist object created each time the up string becomes empty and
            // we put the p string in list and return that list which is called by left first
            // than right and after that we put both the elements together and return the list.
            list.add(p);
            return list;
        }
        ArrayList<String> left = print_Subseq_Ascii_Ret(p+up.charAt(0),up.substring(1));
        ArrayList<String> right = print_Subseq_Ascii_Ret(p,up.substring(1));
        ArrayList<String> ASCII = print_Subseq_Ascii_Ret(p+(up.charAt(0)+0),up.substring(1));
        right.addAll(ASCII);
        left.addAll(right);

        return left;
    }

    private static void print_Subseq_Ascii(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        print_Subseq_Ascii(p+ch,up.substring(1));   // add it or take it
        print_Subseq_Ascii(p,up.substring(1));   // ignore it
        print_Subseq_Ascii(p+(ch+0),up.substring(1));   // add ASCII value of char
    }
}
