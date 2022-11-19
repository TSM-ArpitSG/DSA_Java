package arpit.Lecture8BSquestions;

public class SearchInMountainArr_Q7 {
    public static void main(String[] args) {
        int[] mountainArr = {0,1,2,2,3,4,5,6};
        int target=6;
        int peak = PeakElem(mountainArr);
        int ans = BS(mountainArr,target,0,peak);
        if(ans==-1)
            ans = BS(mountainArr,target,peak+1,mountainArr.length-1);
        System.out.println(ans);
    }
    static int PeakElem( int[] mountainArr){
        int s=0;
        int e=mountainArr.length-1;
        while(s!=e){
            int mid = s+(e-s)/2;
            if(mountainArr[mid]>mountainArr[mid+1])
                e=mid;
            else
                s=mid+1;
        }
        return s;
    }
    static int BS(int[] mountainArr,int target,int s,int e){

        int ans=Integer.MAX_VALUE;
        boolean isAsce =(mountainArr[s]<mountainArr[e]);

        while(s<=e){
            int mid = s+(e-s)/2;
            if(isAsce){
                if(target>mountainArr[mid]){
                    s=mid+1;
                }
                else if(target<mountainArr[mid])
                    e=mid-1;
                else{
                    ans=Math.min(ans,mid);
                    e=mid-1;
                }
            }
            else{
                if(target<mountainArr[mid]){
                    s=mid+1;
                }
                else if(target>mountainArr[mid])
                    e=mid-1;
                else{
                    ans=Math.min(ans,mid);
                    e=mid-1;
                }

            }

        }if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
    }

