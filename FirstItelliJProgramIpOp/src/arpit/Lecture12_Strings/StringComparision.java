package arpit.Lecture12_Strings;

public class StringComparision {
    public static void main(String[] args ) {
//        System.out.println(args[0]);
        String name="Arpit";
        String b="Arpit";
        System.out.println(name==b);// this will give true as name and b are stored in string pool and as they have same
                                    // value they will point to the same object (Optimization).
        String a = new String("Motu");
        String aa = new String("Motu");
        System.out.println(a==aa);// this will give false as we have explicitly created new objects, although they have same value
                                  // Strings object will be created outside String pool and in heap so no optimization. and as == operator
                                  // Checks both value and reference object it will give false.
        System.out.println(a.equals(aa));// this will check only values and as they are same it will give true.
        System.out.println("aas");
    }
}
