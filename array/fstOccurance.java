public class fstOccurance{
    public static void main(String[] args) {
        int[] arr={12,11,2,5,6,2,3};
        int num=2;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==num){
                System.err.println("First ocurance "+i);
                return;
            }
        }
        System.out.println(" element not available");
    }
}