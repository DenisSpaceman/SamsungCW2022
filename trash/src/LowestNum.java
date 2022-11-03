import java.util.Scanner;

public class LowestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int minimal = 999999999;
        while (n > 0){
            if (n % 10 != 0 && minimal > n % 10) minimal = n % 10;
            n /= 10;
        }
        System.out.println(minimal);
    }
}
