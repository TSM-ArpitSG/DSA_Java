package arpit.Lecture4;

import java.util.Arrays;

//primitive types use simple pass by value. a--->10,num1--->10;
//non primitive types use copy of reference (pass by value): a,num1---->10;
public class PassByValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);


        System.out.println(a + " " + b);

        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);

        int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void changeName(String naam) {
        //we cannot modify strings they are immutable as they are declared final.
        naam = "Rahul Rana"; // creating a new object
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function scope only.
    }



    static void change(int[] nums) {
        nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
    }
}
