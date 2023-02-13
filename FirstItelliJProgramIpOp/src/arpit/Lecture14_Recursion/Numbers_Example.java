package arpit.Lecture14_Recursion;

public class Numbers_Example {
    public static void main(String[] args) {
        int n=1;
        print(1);
    }
    static void print(int n){
        System.out.println(1);
        print1(2);
    }
    static void print1(int n){
        System.out.println(2);
        print2(3);
    }
    static void print2(int n){
        System.out.println(3);
        print3(4);
    }
    static void print3(int n){
        System.out.println(4);
        print4(5);
    }
    static void print4(int n){
        System.out.println(5);
    }
}
