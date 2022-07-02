import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch (int [] arr, int x) {

        int found = -1;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == x) {
                found = i;
                break;
            }
        }

        return found;
    }

    public static void main (String [] args) {

        final Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        
        int [] arr = new int [n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt ();
        }

        int x = scanner.nextInt ();

        System.out.println (linearSearch (arr, x));
    }
}
