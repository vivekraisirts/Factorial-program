import java.util.Scanner;
public class JavaFactorial1 {
    public static void main(String args[]) {
        int n, fac = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");

        n = sc.nextInt();
//factorial of 0 is 1
        if(n == 0){
            System.out.println("factorial = " + fac);
        }
        else {
            fac = factorial(n);
            System.out.println("factorial = " + fac);
        }
    }
    public static int factorial(int n){
        if(n < 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

}
