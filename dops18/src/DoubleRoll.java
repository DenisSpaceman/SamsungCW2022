import java.util.Scanner;

public class DoubleRoll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int [] array1 = new int[1001];
        int [] array2 = new int[1001];

        for (int i = 1; i <= n; i++){
            array1[i] = i;
            array2[i] = array1[i];
        }
        for (int i = 0; i <= b - a; i++){
            array1[a + i] = array2[b - i];
        }
        for (int i = 1; i <= n; i++){
            array2[i] = array1[i];
        }
        for (int i = 0; i <= d - c; i++){
            array1[c + i] = array2[d - i];
        }
        for (int i = 1; i <= n; i++){
            System.out.print(array1[i] + " ");
        }
    }
}
