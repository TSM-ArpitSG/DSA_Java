package arpit.Lecture1;

public class Primitive {
    public static void main(String[] args) {
        int rollno = 69;    //stores integer numbers --->4Bytes
        char letter = 'M';  //stores one character '' --->1Byte
        float val = 5.6f;   //stores decimal point numbers need to add 'f' at end --->4Bytes
        double d = 345345.456; //stores large decimal point numbers by default all decimal values are double --->8Bytes
        long largenumber= 112312555221312323L;  //stores large integer type numbers need to add 'L' at end --->8Bytes
        boolean a = true;   //stores true(1) or false(0) values --->1Byte.

        //Wrapper classes of primitive data types are there in order to provide extra functionality to the primitive types.
        Integer roll = 69;
        System.out.println(roll.hashCode(23));
    }
}
