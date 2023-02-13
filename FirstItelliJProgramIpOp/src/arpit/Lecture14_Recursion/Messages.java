package arpit.Lecture14_Recursion;

public class Messages {
    public static void main(String[] args) {
        message();      // message called from main function
    }                   // main ends and program finishes.

    private static void message() {
        System.out.println("Hello");    // hello is printed
        message1();                     // message1 is called inside message;
    }                                   // message finishes and returns to the main function

    private static void message1() {
        System.out.println("Ms Motu!"); // Ms Motu! is printed
        message2();                     // message2 is called inside message1
    }                                   // here function message2 finishes execution and returns and message1 also ends.

    private static void message2() {
        System.out.println("I still remember you!");    // sout is executed.
    }                                                   // the function ends and returns where it was called.
}
