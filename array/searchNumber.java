public class searchNumber {
    static boolean searchTarget(int[] arr, int target){
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==target) 
            return true;

        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5,6,7,8,9};
        int target = 10;
        boolean flag=searchTarget(arr,target);

        if(flag) 
        System.out.print("element found");
        else System.out.print("not found");


    }
}      