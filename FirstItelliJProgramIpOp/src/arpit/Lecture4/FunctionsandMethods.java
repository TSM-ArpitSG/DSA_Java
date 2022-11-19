package arpit.Lecture4;

public class FunctionsandMethods {
    public static void main(String[] args) {
      FunctionsandMethods f = new FunctionsandMethods();
    int a=10,b=20;

        System.out.println(f.sum(a,b));
        System.out.println(a);
    }
    //here we can also declare this function as static
    int sum(int a,int b){
        return a+b;
    }
}
