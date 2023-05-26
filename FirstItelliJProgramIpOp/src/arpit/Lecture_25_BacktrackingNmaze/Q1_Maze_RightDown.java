package arpit.Lecture_25_BacktrackingNmaze;

public class Q1_Maze_RightDown {
    public static void main(String[] args) {
        System.out.println(maze_right_down(3,3));
    }
// 1 based indexing and B->A approach used instead of A->B as the number of ways remain the same.
    private static int maze_right_down(int r, int c) {
        if(r==1||c==1)
            return 1;
        return maze_right_down(r-1,c)+maze_right_down(r,c-1);
    }
}
