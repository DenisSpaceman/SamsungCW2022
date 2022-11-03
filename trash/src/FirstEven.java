import java.util.*;

public class FirstEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 2;
        while (n > 0){
            if (i % 2 == 0){
                System.out.print(i + " ");
                n--;
            }
            i++;
        }
    }
}
