import java.util.Scanner;

public class Remains {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        int i = 10000;
        boolean numisreal = false;
        while (i < 100000){
            if (i % a == b && i % c == d){
                numisreal = true;
                System.out.print(i + " ");
            }
            i++;
        }
        if (!numisreal) System.out.println(-1);
    }
}
