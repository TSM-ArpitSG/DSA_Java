package Lecture_23_SubSetQuestion_str;

public class Q1_Removeachar_str {
    public static void main(String[] args) {
        System.out.println(remove_a1("","baads"));
        System.out.println(remove_a("baccad",0));

    }
    private static String remove_a1(String ans, String str) {
        if(str.isEmpty())
            return ans;
        if(str.charAt(0)=='a')
            return remove_a1(ans,str.substring(1));
        else return remove_a1(ans+str.charAt(0),str.substring(1));
    }
    private static String remove_a(String str, int i) {
        if(i==str.length())
            return "";
        if(str.charAt(i)=='a')
            return remove_a(str,i+1);
        else return str.charAt(i)+remove_a(str,i+1);
    }
}
