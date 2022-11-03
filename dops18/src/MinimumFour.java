public class MinimumFour {
    public static void main(String[] args) {
        System.out.println(min(5, 4, 6, 7));
    }
    public static int min(int a, int b, int c, int d){
        int [] array = {a, b, c, d};
        int min = array[0];
        for (int i = 0; i < 4; i++){
            if (min > array[i]) min = array[i];
        }
        return min;
    }
}
