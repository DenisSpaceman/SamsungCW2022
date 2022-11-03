import java.util.Scanner;

public class whitoutdividing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();
        if (a == 0 || b == 0) System.out.println(0);
        if (a < 0 && b > 0){
            int buffa = a;
            while (b > 1){
                buffa += a;
                b--;
            }
            System.out.println(buffa);
        }
        if (a > 0 && b < 0){
            int buffb = b;
            while (a > 1){
                buffb += b;
                a--;
            }
            System.out.println(buffb);
        }
        if (a > 0 && b > 0){
            int buffa = a;
            while (b > 1){
                buffa += a;
                b--;
            }
            System.out.println(buffa);
        }
        if (a < 0 && b < 0){
            a *= -1;
            b *= -1;
            int buffa = a;
            while (b > 1){
                buffa += a;
                b--;
            }
            System.out.println(buffa);
        }
    }
}
