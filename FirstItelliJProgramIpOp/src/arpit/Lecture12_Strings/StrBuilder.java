package arpit.Lecture12_Strings;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("");
        System.out.println(s.capacity());
        s.length();
        for (int i = 0; i < 26; i++) {      // T.C: O(n)
            char ch=(char)('a'+i);
            s.append(ch);           // here the already existing StringBuilder Object is modified each time.
        }
        System.out.println(s);
        System.out.println(s.length()+""+s.capacity());
    }
}
