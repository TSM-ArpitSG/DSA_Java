package arpit.Lecture_16_BitManipulation;

public class Q7_ElementsAppearing3times {
    static final int int_bit_size = 32;         // to access each bit of the integer value.
    public static void main(String[] args) {
        int[] arr={2,2,1,2,7,7,8,7,8,8};
        System.out.println(find_Unique(arr));
    }

    private static int find_Unique(int[] arr) {
        int sum,mask;
        int res=0;
        for(int i=0;i<int_bit_size;i++){
            sum=0;
            mask=1<<i;
            for (int k : arr) {
                if ((k & mask) != 0)
                    sum++;
            }
            if(sum%3!=0)
                res|=mask;
        }
        return res;
    }
}
