public class Points {
    public static void main(String[] args) {
        System.out.println(trianglePerimetr(-2, -4, -3, -4, -1, 1));
    }
    public static double segmentLength(int x1, int y1, int x2, int y2){
        return Math.sqrt((double) (x2 - x1) * (x2 - x1) + (double) (y2 - y1) * (y2 - y1));
    }
    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3){
        double lenght1 = segmentLength(x1, y1, x2, y2);
        double lenght2 = segmentLength(x2, y2, x3, y3);
        double lenght3 = segmentLength(x3, y3, x1, y1);
        return lenght1 + lenght2 + lenght3;
    }
}
