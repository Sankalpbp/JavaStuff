import java.util.Scanner;

public class ArrayPrint {

    public static void printArray (int [] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.println (arr[i] + " ");
        }
    }
    
    public static void main (String... args) {

        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();

        int [] arr = new int [n];

        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt ();
        }

        printArray (arr);
    }
}
