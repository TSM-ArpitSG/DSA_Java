package arpit.Lecture_18_RecursionQues;

public class Passing_Concept {
    public static void main(String[] args) {
        func(5);
    }

    private static void func(int n) {
        if(n==0)
            return;
        System.out.println(n);
        func(n--);  //func(--n) works.
    }
}
