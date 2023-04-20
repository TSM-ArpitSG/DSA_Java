package arpit.Lecture_23_SubSetQuestion_str;

public class Q1_Skip_a {
    public static void main(String[] args) {
        // Approach 1:
        System.out.println(remove_a1("","baddads"));
        // Approach 2:
        System.out.println(remove_a2("baccad"));
        // Approach 2: using pointer
        System.out.println(remove_a2("baaasfsd",0));
    }
    //Approach 1 : using ans as extra parameter in the function.
    private static String remove_a1(String ans, String str) {
        if(str.isEmpty())
            return ans;
        if(str.charAt(0)=='a')
            return remove_a1(ans,str.substring(1));
        else return remove_a1(ans+str.charAt(0),str.substring(1));
    }
    //Approach 2 : using return statement without passing as extra ans parameter.
    private static String remove_a2(String str) {
        if(str.isEmpty())
            return "";
        if(str.charAt(0)=='a')
            return remove_a2(str.substring(1));
        else return str.charAt(0)+remove_a2(str.substring(1));
    }
    //Alternate way of implementing approach 2: using a pointer.
    private static String remove_a2(String str, int i) {
        if(i==str.length())
            return "";
        if(str.charAt(i)=='a')
            return remove_a2(str,i+1);
        else return str.charAt(i)+remove_a2(str,i+1);
    }
}
