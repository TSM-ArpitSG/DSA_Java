package Assignment_Questions.Lecture1_Flowchart;
// 0 1 1 2 3 5 8 ...
public class Fibonacci_Series {
    public static void main(String[] args) {
        int n = 5;
        int i=0;
        int a=0;
        int b=1;
        while(i!=n){
            int c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
            i++;
        }
    }
}
