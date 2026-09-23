public class ReverseArray{
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}