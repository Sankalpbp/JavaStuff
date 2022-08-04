import java.util.Scanner;

public class CheckPalindrome {

    public static boolean ifPalindrome (String s) {
        int i = 0, j = s.length () - 1;

        while (i < j) {
            if (s.charAt (i) != s.charAt (j)) {
                return false;
            }
            ++i;
            --j;
        }

        return true;
    }

    public static void main (String... args) {

        final Scanner scanner = new Scanner (System.in);
        String s = new String ();
        s = scanner.next ();

        if ( ifPalindrome (s) ) {
            System.out.println ("string is a palindrome.");
        } else {
            System.out.println ("String is not a palindrome.");
        }
    }
}
