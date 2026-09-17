public class lastOccurance{
    public static void main(String[] args) {
        int[] arr={5,3,2,2,2,3,7,5,2,4};
        int num=2;
        for (int i=arr.length-1;i>=0;i--) {
            if (arr[i]==num){
                System.err.println("last ocurance "+i);
                return;
            }
        }
        System.out.println(" element not available");
    }
}