import java.util.Scanner;

public class EvenElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }
        int c = 1;
        for (int i = 0; i < array.length; i++){
            if (i < array.length - 1 && array[i] != array[i + 1]) c++;
        }
        System.out.println(c);
    }
}
