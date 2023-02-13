package arpit.Lecture12_Strings;

public class StringPerformance {
    public static void main(String[] args) {
        String alphabets = "";      // T.C: O(n^2)
        for (int i=0;i<26;i++){
            char ch = (char)('a'+i);
            alphabets+=ch;  // each time new object of String is created by copying prev string and appending it with one char.
        }
        System.out.println(alphabets);
    }
}
