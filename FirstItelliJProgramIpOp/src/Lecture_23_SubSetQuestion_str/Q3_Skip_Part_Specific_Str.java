package Lecture_23_SubSetQuestion_str;

public class Q3_Skip_Part_Specific_Str {
    public static void main(String[] args) {
        // when apple is not present remove app.
        System.out.println(skip_part_spec("bacasapp","app"));
        // when apple is present don't remove app.
        System.out.println(skip_part_spec("bacasappletry","app"));
        // mixed example
        System.out.println(skip_part_spec("bcappsfapplegg","app"));
    }

    private static String skip_part_spec(String str, String part) {
        if(str.isEmpty())
            return "";
        if(str.startsWith(part) && !str.startsWith("apple"))
            return skip_part_spec(str.substring(part.length()),part);
        else
            return str.charAt(0)+skip_part_spec(str.substring(1),part);
    }
}
