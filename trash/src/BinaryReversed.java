import java.util.Scanner;

public class BinaryReversed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int razryads = 0, testn = n;
        while (testn > 0){
            testn /= 2;
            razryads += 1;
        }
        int [] binary = new int[razryads];
        for (int i = 0; i < binary.length; i++){
            binary[i] = n % 2;
            n /= 2;
        }
        for (int i = 0; i < binary.length; i++) System.out.print(binary[i]);
    }
}
