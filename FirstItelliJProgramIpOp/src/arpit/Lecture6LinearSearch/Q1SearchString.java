package arpit.Lecture6LinearSearch;

public class Q1SearchString {
    public static void main(String[] args) {
        String arr = "Arpit Motu";
        char target = 'M';
        if(LinearSeachString2(arr,target))
            System.out.println("Charcter found!");
        else
            System.out.println("Character not found!");
    }

    private static boolean LinearSeachString(String arr, char target) {
        boolean ans = false;
        for(int i=0;i<arr.length();i++){
            if(target == arr.charAt(i)){
                ans = true;
                break;
            }
        }
        return ans;
    }
    private static boolean LinearSeachString2(String arr, char target) {
        boolean ans = false;
        for(char i:arr.toCharArray()){
            if(target == i){
                ans = true;
                break;
            }
        }
        return ans;
    }
}
