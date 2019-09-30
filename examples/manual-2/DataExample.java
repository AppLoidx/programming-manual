/**
 * @author Arthur Kupriyanov
 */
public class DataExample {

    public static void main(String[] args) {
        System.out.print("Enter a:");
        int a = Integer.parseInt(System.console().readLine());
        System.out.print("Enter b:");
        int b = Integer.parseInt(System.console().readLine());
        System.out.println("a+b=" + pow(a,b));
    }

    private static Long pow(int base, int exponent) {
        long result = 1L;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
