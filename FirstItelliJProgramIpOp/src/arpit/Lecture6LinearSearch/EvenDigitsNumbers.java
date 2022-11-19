package arpit.Lecture6LinearSearch;

public class EvenDigitsNumbers {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896,-23,0};
        int c=0;
        for (int num : arr) {
            if (evenDigit(num)) c++;
        }
        System.out.println(c);
    }

    private static boolean evenDigit(int num) {
        if(num<0)
            num*=-1;

        int dc=(int)Math.log10(num)+1;
//        if(num==0)
//            dc=1;
//        while(num!=0){
//            dc++;
//            num=num/10;
//        }
        //optimized:
        return dc % 2 == 0;

    }
}
