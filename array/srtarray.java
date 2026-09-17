public class srtarray {
    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={5,7,8,12,22,25,30};
        System.out.println(isSorted(arr));
    }
}