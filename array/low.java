import java.util.Scanner;
public class low {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("enter value");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min=arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Lowest element = " + min);

        sc.close();
    }
}
