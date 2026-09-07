
public class StarPattern {
    public static void main(String[] args) {
        //int n=4;
        // for(int i=1; i<=3; i++){
        //     for (int j=1; j<=3; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        
        // }
        // for(int i=1; i<=n; i++){
        //     for (int j=i; j<=n; j++){
        //         System.out.print("  ");
        //     }
        //     for ( int k=1;k<=i;k++) {
        //    System.out.print("* "); 

        // }
        //  System.out.print("\n");
        
        // }
        // for(int i=1; i<=n; i++){
        //     for (int j=i; j<=n; j++){
        //         System.out.print("  ");
        //     }
        //     for ( int k=1;k<=i;k++) {
        //    System.out.print("* "); 

        // }
        //  System.out.print("\n");
        
        // }
        // for(int i=1; i<=n; i++){
        //     for (int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for ( int k=1;k<=2*i-1;k++) {
        //    System.out.print("* "); 

        // }
        //  System.out.print("\n");
        
        // }
        
    //     int n=5;
    //     for(int i=1;i<=n;i++){
            
    //         for(int j = i ; j <= n-1 ; j++){
    //             System.out.print("  ");
    //         }
    //         for(int k = 1 ; k <= i ; k++){
    //             System.out.print("* ");
    //         }
    //         for(int l = 2 ; l <= i ; l++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }

    //     for(int i =0 ; i <= n ; i++){
    //         for(int j = 1 ; j <= i ;j++){
    //             System.out.print("  ");
    //         }
    //         for(int k = i ; k <= n ; k++){
    //             System.out.print("* ");
    //         }
    //         for(int l = i+1 ; l <= n ; l++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // int n=5;

    //  for (int i = 1; i <= n; i++) {

    //         // 1. Spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }

    //         // 2. Left stars
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }

    //         // 3. Right stars
    //         for (int j = 1; j < i; j++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }

    //     // Lower half
    //     for (int i = n - 1; i >= 1; i--) {

    //         // 1. Spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }

    //         // 2. Left stars
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }

    //         // 3. Right stars
    //         for (int j = 1; j < i; j++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }
// for (int i = 1; i <= 5; i++) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print(i);
//     }
//     System.out.println();
// }
    
    //  int n = 5;

    //     for (int i = 1; i <= n; i++) {

    //         // Spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }

    //         // Numbers
    //         for (int j = 1; j <= 2 * i - 1; j++) {
    //             System.out.print(i);
    //         }

    //         System.out.println();
    //     }

    //   int n = 5;

    //     for (int i = n; i >= 1; i--) {

    //         // Spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }

    //         // Numbers
    //         for (int j = 1; j <= 2 * i - 1; j++) {
    //             System.out.print(i);
    //         }

    //         System.out.println();
    //     }

   
        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

 }






