package arpit.Lecture12_Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float n = 123.2773f;
        System.out.printf("Formatted Number is : %.2f %n",n);  // this basically converts the n floating number to print values till 2 decimal places.
                                                            // this printf() also rounds off the number in case of 123.277 the last digit
                                                            // is rounded off as 8 -->123.28

//        System.out.println();
        System.out.println(Math.PI);
        System.out.printf("%.3f",Math.PI);  // rounds off as well.

        System.out.printf(" My name is %s and I love ms %s 3000","Arpit","Motu");


    }
}
