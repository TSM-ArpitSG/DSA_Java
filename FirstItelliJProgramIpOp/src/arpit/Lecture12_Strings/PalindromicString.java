package arpit.Lecture12_Strings;

import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
//        System.out.println(palindrome_1(str1));
        System.out.println(palindrome_2(str1));
    }



    //Approach 1 : Using 2 nested loops
    // T.C : O(n^2)
    // S.C : O(1)
    private static boolean palindrome_1(String str1) {
        int n  = str1.length();
        for (int i = 0; i < n;) {
            for(int j=n-1;j>=0;){
                if(str1.charAt(i)!= str1.charAt(j))
                    return false;
                else{
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
    // Approach 2 : Using 1 loop
    // T.C : O(n)
    // S.C : O(1)
    private static boolean palindrome_2(String str1) {
        int n = str1.length();
        for(int i=0;i<n/2;i++){
            if(str1.charAt(i)!=str1.charAt(n-1-i))
                return false;
        }
        return true;
    }
}
