import java.util.Scanner;
public class JavaFactorial {
    public static void main(String args[]) {
        int n, i, fac = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");

        n = sc.nextInt();
//factorial of 0 is 16
        if (n == 0) {
            System.out.println("factorial = " + fac);
        } else {
            for (i = 1; i <= n; ++i) {
                fac *= i;
            }
            System.out.println("factorial = " + fac);
        }

    }
}
