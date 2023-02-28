package arpit.Lecture_18_RecursionQues;

public class Q1_PrintN {
    public static void main(String[] args) {
        func(5);
        System.out.println();
        func1(5);
        System.out.println();
        func3(5);
    }

    private static void func3(int n) {
        if(n==0)
            return;
        System.out.println(n);
        func3(n-1);
        System.out.println(n);
    }

    private static void func1(int n) {
        if(n==0)
            return;

        func1(n-1);
        System.out.println(n);
    }

    private static void func(int n) {
        if(n==0)
            return;
        System.out.println(n);
        func(n-1);
    }
}
