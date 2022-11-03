import java.math.BigInteger;
import java.util.Scanner;

public class SimpleNear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int buff = n;
        while (true){
            BigInteger bigInteger = BigInteger.valueOf(buff);
            boolean simple = bigInteger.isProbablePrime((int) Math.log(buff));
            if (simple && buff != n){
                System.out.println(buff);
                break;
            }
            buff++;
        }
    }
}
