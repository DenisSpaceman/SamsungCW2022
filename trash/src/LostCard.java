import java.util.Scanner;

public class LostCard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = 0, m = n * (n + 1) / 2;
        for (int i = 0; i < n - 1; i++){
            k += in.nextInt();
        }
        System.out.println(m - k);
    }
}
