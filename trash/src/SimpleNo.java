import java.util.Scanner;

public class SimpleNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), i = 1;
        boolean iscomposte = false;
        while (i <= n){
            if (i != 1 && i != n && n % i == 0 ){
                System.out.println("composite");
                iscomposte = true;
                break;
            }
            i++;
        }
        if (!iscomposte) System.out.println("prime");
    }
}
