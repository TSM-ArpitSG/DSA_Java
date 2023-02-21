package arpit.Lecture_17_MathforDSA;

public class Q2_SqarerootN {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(sqrt(36));
        System.out.println(sqrtp(n,3));

    }

    private static double sqrtp(int n, int p) {
        double root=0.0;
        int s=0,e=n;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*mid==n)
                return mid;
            else if(mid*mid>n)
                e=mid-1;
            else{
                s=mid+1;
                root=mid;
            }
        }
        double incr=0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<=n)
                root+=incr;

            root-=incr;
            incr/=10;
        }

        return root;
    }

    // 1: for pefect sqaure roots. like 36.
    // TC ---> O(log(N))
    private static int sqrt(int n) {
        int s=0,e=n;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid*mid>n)
                e=mid-1;
            else if (mid*mid<n)
                s=mid+1;
            else return mid;
        }
        return -1;
        // not a perfect square.
    }
}
