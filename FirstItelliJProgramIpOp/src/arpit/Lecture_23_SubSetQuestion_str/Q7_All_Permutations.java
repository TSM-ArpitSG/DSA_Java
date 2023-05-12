package arpit.Lecture_23_SubSetQuestion_str;

import java.util.ArrayList;

public class Q7_All_Permutations {
    public static void main(String[] args) {
        print_All_Permu("","abc");
        System.out.println(ret_All_Permu("","abc"));
        System.out.println(count_All_Permu("","abc"));
        System.out.println(count_All_Permu2("","abc",0));
    }

    private static void print_All_Permu(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        for (int i = 0; i <= p.length(); i++) {
            print_All_Permu(p.substring(0,i)+up.charAt(0)+p.substring(i,p.length()),up.substring(1));
        }
    }
    private static ArrayList<String> ret_All_Permu(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
             res.addAll(ret_All_Permu(p.substring(0,i)+up.charAt(0)+p.substring(i,p.length()),up.substring(1)));
        }
        return res;
    }

    private static int count_All_Permu(String p, String up) {
        if(up.isEmpty()){
            return 1;
        }
        int res = 0;
        for (int i = 0; i <= p.length(); i++) {
            res+=count_All_Permu(p.substring(0,i)+up.charAt(0)+p.substring(i,p.length()),up.substring(1));
        }
        return res;
    }
    private static int count_All_Permu2(String p, String up,int c) {
        if(up.isEmpty()){
            return c+1;
//            return 1;
        }
        for (int i = 0; i <= p.length(); i++) {
            c=count_All_Permu2(p.substring(0,i)+up.charAt(0)+p.substring(i,p.length()),up.substring(1),c);
        }
        return c;
    }
}
