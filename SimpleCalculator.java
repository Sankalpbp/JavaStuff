public class SimpleCalculator {

    private int n;
    private int m;

    private int sum;
    private int difference;

    public void add () {
        sum = n + m;
    }

    public SimpleCalculator (int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int getSum () {
        return sum;
    }

    public int getDifference () {
        return difference;
    }

    public void subtract () {
        difference = n - m;
    }

    public static void main (String... args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator (1, 2);
        simpleCalculator.add ();
        simpleCalculator.subtract ();

        System.out.println (simpleCalculator.getSum ());
        System.out.println (simpleCalculator.getDifference ());
    }
}
