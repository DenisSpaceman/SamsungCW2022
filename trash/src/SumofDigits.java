import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
