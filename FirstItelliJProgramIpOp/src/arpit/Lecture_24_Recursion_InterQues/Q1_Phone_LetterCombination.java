package arpit.Lecture_24_Recursion_InterQues;

import java.util.ArrayList;

public class Q1_Phone_LetterCombination {
    public static void main(String[] args) {
        String digit = "79";
        System.out.println((letter_combination("",digit).size()));
        System.out.println(letter_combination_count("",digit));
    }

    private static ArrayList<String> letter_combination(String p,String up) {
        if(up.isEmpty()){
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        int digit = up.charAt(0)-'0';
        int s=0,e=0;
        if(digit<=6){
            s = (digit-2)*3;
            e = (digit-1)*3;
        }
        else if(digit==7){
            s = (digit-2)*3;
            e = (digit-1)*3+(1);
        }
        else if(digit==8){
            s = (digit-2)*3+1;
            e = (digit-1)*3+(1);
        }else{
            s = (digit-2)*3+1;
            e = (digit-1)*3+(2);
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i=s;i<e;i++){
            ans.addAll(letter_combination(p+(char)('a'+ i),up.substring(1)));
        }
        return ans;
    }

    private static int letter_combination_count(String p,String up) {
        if(up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0)-'0';
        int s=0,e=0;
        if(digit<=6){
            s = (digit-2)*3;
            e = (digit-1)*3;
        }
        else if(digit==7){
            s = (digit-2)*3;
            e = (digit-1)*3+(1);
        }
        else if(digit==8){
            s = (digit-2)*3+1;
            e = (digit-1)*3+(1);
        }else{
            s = (digit-2)*3+1;
            e = (digit-1)*3+(2);
        }
        int ans = 0;
        for (int i=s;i<e;i++){
            ans+=(letter_combination_count(p+(char)('a'+ i),up.substring(1)));
        }
        return ans;
    }
}
