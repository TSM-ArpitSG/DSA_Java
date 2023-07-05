package arpit.Lecture_25_BacktrackingNmaze;

import java.util.ArrayList;

public class Q1_Maze_RightDown {
    public static void main(String[] args) {
//        System.out.println(maze_right_down(3,3));
//        maze_right_down("",3,3);
        System.out.println(maze_right_down_ret("",3,3));
    }
// 1 based indexing and B->A approach used instead of A->B as the number of ways remain the same.
    private static int maze_right_down(int r, int c) {
        if(r==1||c==1)
            return 1;
        return maze_right_down(r-1,c)+maze_right_down(r,c-1);
    }
    private static void maze_right_down(String p,int r, int c) {
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1)
            maze_right_down(p+"d",r-1,c);
        if(c>1)
            maze_right_down(p+"r",r,c-1);
    }
    private static ArrayList<String> maze_right_down_ret(String p, int r, int c) {
        if(r==1&&c==1){
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1)
            list.addAll(maze_right_down_ret(p+"d",r-1,c));
        if(c>1)
           list.addAll(maze_right_down_ret(p+"r",r,c-1));
        return list;
    }
}
