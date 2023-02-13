package arpit.Lecture14_Recursion;

public class BS_Recursion_Q2 {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,6,8};
        System.out.println(recursion_BS(arr,6,0,arr.length-1));
    }
    static int recursion_BS(int[] arr,int target,int s, int e){
        if(s>e){            // base condition
            return -1;      // element not found
        }
        int mid = s+(e-s)/2;    // body variable mid calculated specific to a particular function call
        if(target<arr[mid])     // 3 condtitions of BS:
                                // here we need to keep in mind that while recursively calling a function with a return type
                                // we need to use the return statement as otherwise it will go on to the main function
                                // without returning the actual result that is in this case the previous value of mid is called
                                // using debugger.
             return recursion_BS(arr,target,s,mid-1);
        else if(target>arr[mid])
             return recursion_BS(arr,target,mid+1,e);
        return mid;             // here else is not required as we are using return condition at each check hence
                                // the program will not execute the statements after the return is encountered.

    }
}
