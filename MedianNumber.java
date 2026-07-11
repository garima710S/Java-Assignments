public class MedianNumber {
    public static void main(String[] args) {
        int a = 15, b = 10, c = 20;

        int median = (a > b)
                ? ((a < c) ? a : (b > c ? b : c))
                : ((b < c) ? b : (a > c ? a : c));

        System.out.println("Median = " + median);
    }
}
