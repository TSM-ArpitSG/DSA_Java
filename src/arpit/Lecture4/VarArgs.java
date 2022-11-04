package arpit.Lecture4;

public class VarArgs {
    public static void main(String[] args) {
//        VarArgsSum();   // here ambiguity in deciding which function definition to choose.
        VarArgsSum(1,2,3,4);

    }
    //method overloading and varArgs ambiguity.
    static void VarArgsSum(String ...v){
        System.out.println(v);
    }

     static void VarArgsSum(int ...v) {
        int sum=0;
        for(int i : v){
            sum+=i;
        }
         System.out.println(sum);
    }
}
