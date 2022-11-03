import java.util.Scanner;

public class PetkaVaska{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), c = 1;
        int [][] array = new int[n][n];
        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = c;
                c++;
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i][i] + " ");
        }
    }
}
