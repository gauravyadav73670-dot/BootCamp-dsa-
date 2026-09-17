public class lnsearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}