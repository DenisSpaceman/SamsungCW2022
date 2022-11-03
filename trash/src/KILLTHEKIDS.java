import java.util.Scanner;

public class KILLTHEKIDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), i = 1;
        boolean crash = false;
        while (i <= n){
            int brhi = in.nextInt();
            if (brhi <= 437){
                crash = true;
                break;
            }
            i++;
        }
        if (crash) System.out.println("Crash " + i);
        else System.out.println("No crash");
    }
}
