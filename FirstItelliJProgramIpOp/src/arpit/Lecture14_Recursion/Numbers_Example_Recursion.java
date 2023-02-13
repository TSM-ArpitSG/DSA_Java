package arpit.Lecture14_Recursion;

public class Numbers_Example_Recursion {
    public static void main(String[] args) {
        int n=1;
        print(n);
    }
    static void print(int n){
        if(n>5)                    //exceptional case as the body is not same when n is 5. no call statement.
            return;

        System.out.println(n);      //print
        print(n+1);                 //call
    }
}
