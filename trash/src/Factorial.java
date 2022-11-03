import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
