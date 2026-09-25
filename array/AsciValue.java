public class AsciValue {
    // public static void main(String[] args) {

        // String s = "gaurav";
        // String result = "";

        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);

        //     if (ch >= 'a' && ch <= 'z') {
        //         ch = (char)(ch - 32);
        //     }

        //     result = result + ch;
        // }

        // System.out.println(result);
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     int asciiValue = (int) ch;
        //     System.out.println("Character: " + ch + ", ASCII Value: " + asciiValue);
        // }

        // for(int i = -32000 ; i <= 32000 ; i++){
        //     System.out.println( i + " -> " + (char)(i));
        // }

        // System.out.print(22+ "" + (char)188);

        
    public static boolean check(String s1, char ch) {
        return s1.contains("" + ch);
    }

    public static void main(String[] args) {
        String s1 = "gaurav";

        System.out.println(check(s1, 'a'));
        System.out.println(check(s1, 'z'));
    }
}
