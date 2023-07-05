package arpit.Lecture_25_BacktrackingNmaze;

import java.util.ArrayList;

public class Q2_Maze_Right_Down_Diagonal {
    public static void main(String[] args) {
        System.out.println(maze_right_down_dia_ret("",3,3));
    }
    private static ArrayList<String> maze_right_down_dia_ret(String p, int r, int c) {
        if(r==1&&c==1){
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1)
            list.addAll(maze_right_down_dia_ret(p+"d",r-1,c));
        if(c>1)
            list.addAll(maze_right_down_dia_ret(p+"r",r,c-1));
        if(c>1 && r>1)
            list.addAll(maze_right_down_dia_ret(p+"Dia",r-1,c-1));
        return list;
    }
}
