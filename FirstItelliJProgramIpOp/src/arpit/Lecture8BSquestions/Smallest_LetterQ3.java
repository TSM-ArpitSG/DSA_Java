package arpit.Lecture8BSquestions;

public class Smallest_LetterQ3 {
    public static void main(String[] args) {
        char[] arr = {'c','d','f','j'};
        char res = Smallest_Letter(arr,'d');
        System.out.println(res);
        System.out.println(~0);
    }

    private static char Smallest_Letter(char[] arr, char target) {
        int s = 0;
        int end = arr.length-1;
        while(s<=end){
            int mid = s +(end-s)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return arr[s%arr.length];      //if(s==arr.length) return arr[0]  --->letters wrap around
    }
}
