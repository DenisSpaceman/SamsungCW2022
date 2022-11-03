public class MTB {
    public static void main(String[] args) {
        int [] x = {200, -5555, 4852, -5555, 15, 78, 65};
        minToBegin(x);

    }
    public static void minToBegin(int [] arr){
        int [] array = arr;
        int elem = 999999999;
        for (int i = 0; i < array.length; i ++){
            if (elem > array[i]) elem = array[i];
        }
        int n = 0;
        for (int i = 0; i < array.length; i ++){
            if (elem == array[i]){
                n = i;
                break;
            }
        }
        int [] out = new int[array.length];
        for (int i = 0; i < out.length; i++){
            if (i != n) out[i] = array[i];
        }

        for (int i = 0; i < out.length; i++){
            System.out.print(out[i] + " ");
        }
    }
}
