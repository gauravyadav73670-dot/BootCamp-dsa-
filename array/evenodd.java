public class evenodd {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int counteven = 0;
        int countodd = 0;

        for (int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                counteven++;
            } else {
                countodd++;
            }
        }

        System.out.println("Even numbers: " + counteven);
        System.out.println("Odd numbers: " + countodd);
    }
}