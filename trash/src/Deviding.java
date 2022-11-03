import java.util.Locale;
import java.util.Scanner;

public class Deviding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        double a = in.nextDouble(), res = 1.0;
        int n = in.nextInt();
        if (n < 0){
            n = -n;
            a = 1.0 / a;
        }
        while (n > 0){
            res *= a;
            n--;
        }
        System.out.println(res);
    }
}
