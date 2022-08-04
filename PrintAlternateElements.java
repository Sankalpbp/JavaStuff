import java.util.Scanner;

public class PrintAlternateElements {

    public static void printAlternateElements (int [] arr) {
        System.out.println ();
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print (arr[i] + " ");
        }
        System.out.println ();
    }

    public static void main (String [] args) {

        final Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int [] arr = new int [n];

        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt ();
        }

        printAlternateElements (arr);
    }
}
