public class Revers {
public static void main(String[] args) {
// String s = "Gaurav";

// String reverse = "";

// for (int i = s.length() - 1; i >= 0; i--) {
//     reverse += s.charAt(i);
// }

// System.out.println(reverse);
   String s = "madam";

String reverse = "";

for (int i = s.length() - 1; i >= 0; i--) {
    reverse += s.charAt(i);
}

if (s.equals(reverse)) {
    System.out.println("Palindrome");
} else {
    System.out.println("Not Palindrome");
}

   }

 }