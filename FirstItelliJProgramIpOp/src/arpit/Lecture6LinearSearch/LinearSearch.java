package arpit.Lecture6LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={5,2,7,8,10};
        int idxfound = LinearSearchArr(arr,7);
        if(idxfound!=-1)
            System.out.println("Element found at index :"+idxfound);
        else
            System.out.println("Element not found");
    }
    static int LinearSearchArr(int[] arr,int x){
        int idx=-1;
        if(arr.length==0)
            return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                idx = i;
                break;
            }
        }
        return idx;
    }
}
