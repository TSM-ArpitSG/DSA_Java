/* Save this in a file called Main.java to compile and test it */
//Arpit Singh
// This Approach uses a Two pointer method. Where i and j are two pointers along with a 3rd pointer which navigates within a
// subarray or Descent.

// so the core logic is:
//1--> run through the Array List with a for loop (traversal)
//2--> set 2 pointers k=i and j=i+1;
//3--> compare the consecutive elements with the help of these 2 pointers
//4--> run a nested loop until the end of array is reached or the next element is smaller than the current element.
//5--> check if the current size of sub-array is greater than the previous ones. and if yes update the h and windowsize(longest descent)
//6--> set i=j as in case the while loop beaks it will point to the next set of possible descent.
//7--> return the height
// T.C: O(n^2)
/* Do not add a package declaration */

import java.util.ArrayList;
import java.util.Scanner;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {


    public static int processArray(ArrayList<Integer> array) {
        //System.out.println(array.size());
        int h = Integer.MIN_VALUE;
        int windowSize=1;
        for(int i=0;i<array.size()-1;){
            int setL=1;
            int j=i+1;
            int k=i;
            while(j<array.size()&& array.get(j) <= array.get(k)){
                if(++setL>=windowSize){
                h=Math.max(h,array.get(i)-array.get(j));
                windowSize=Math.max(windowSize,setL);
            }
                j++;k++;
        }
            i=j;
        }
        return h;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;

            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}