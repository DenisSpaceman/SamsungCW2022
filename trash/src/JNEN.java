import java.util.Scanner;

public class JNEN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int out = 0;
        boolean innum = false;
        while (n != 0){
            int dec = n % 10;
            if (dec % 2 != 0){
                out = dec;
                innum = true;
                break;
            }
            n /= 10;
        }
        if (innum) System.out.println(out);
        else System.out.println("NO");
    }
}
