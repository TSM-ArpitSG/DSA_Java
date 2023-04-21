package arpit.Lecture_23_SubSetQuestion_str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6_All_Subsets {
    public static void main(String[] args) {
        System.out.println(all_subsets(new int[]{1, 2}));
        System.out.println(all_subsets_Dupli(new int[]{1, 2, 2}));

    }

    private static List<List<Integer>> all_subsets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int elem : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(elem);
                outer.add(internal);
            }
        }
        return outer;
    }

    private static List<List<Integer>> all_subsets_Dupli(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0, end = 0;
        for (int j = 0; j < arr.length; j++) {
            start = 0;
            if (j > 0 && arr[j] == arr[j - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int i = start; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
//
//            } else {
//                n = outer.size();
//                for (int i = 0; i < n; i++) {
//                    List<Integer> internal = new ArrayList<>(outer.get(i));
//                    internal.add(elem);
//                    outer.add(internal);
//                    internalcopy=internal;
//                }
//            }
////            for (int i = 0; i < n; i++) {
////                if(j!=0 && elem==arr[j-1]){
////                    List<Integer> secondhalf = new ArrayList<>(internalcopy.get(i));
////                    secondhalf.add(elem);
////                    outer.add(secondhalf);
////                    internalcopy.add(secondhalf.get(i));
////                }
////                else{
////                List<Integer> internal = new ArrayList<>(outer.get(i));
////                internal.add(elem);
////                outer.add(internal);
////                internalcopy.add(internal.get(i));
////                }
////            }
////        }
////        return outer;
//        }
//        return outer;
//    }
//}