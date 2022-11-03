import java.util.Scanner;

public class SameNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), previous = 0, real = 0;
        boolean innum = false;
        while (n > 0){
            previous = n % 10;
            n /= 10;
            real = n % 10;
            if (previous == real){
                System.out.println("YES");
                innum = true;
                break;
            }
        }
        if (!innum) System.out.println("NO");
    }
}
