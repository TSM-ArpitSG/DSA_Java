package arpit.Lecture_23_SubSetQuestion_str;

public class ASCII_Value_Char {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch+0);       // implicit type conversion of ch --> integer (ASCII)  than add 0 so gives 'a' --> 97.
        System.out.println((char)(ch+0+1)); // explicitly casted into char so 97+0+1-->98(b)
    }
}
