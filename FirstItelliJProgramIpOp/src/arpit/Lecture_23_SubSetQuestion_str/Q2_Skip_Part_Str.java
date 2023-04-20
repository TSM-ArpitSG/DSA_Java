package arpit.Lecture_23_SubSetQuestion_str;

public class Q2_Skip_Part_Str {
    public static void main(String[] args) {
        System.out.println(skip_part("bcvasapplesdf","apple"));
    }

    // using startsWith() function.
    private static String skip_part(String str, String part) {
        if(str.isEmpty())
            return "";
        if(str.startsWith(part))
            return skip_part(str.substring(part.length()),part);
        else
            return str.charAt(0)+skip_part(str.substring(1),part);
    }
}
