import java.util.HashSet;
public class Duplicate {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5,6,1, 3, 4, 2,1};
         int n= arr.length;
        // for (int i = 0; i < n; i++) {

        //     for (int j = i + 1; j < n; j++) {

        //         if (arr[i] == arr[j]) {
        //             System.out.print( arr[i]+ " ");
        //             //break;
        //         }
        //     }
        // }
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            if (!set.add(arr[i])) {
                System.out.println(arr[i]+ " ");
            }
        }
    }
}