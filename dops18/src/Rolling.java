import java.util.Scanner;

public class Rolling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), m = in.nextInt();
        int [][] array = new int[n][m];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = in.nextInt();
            }
        }
        System.out.println(m + " " + n);
        int [][] out = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = n - 1; j >= 0; j--){
                out[i][j] = array[j][i];
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
