public class avg_method {

    static int avg(int... arr) {
        int sum = 0;
        int n = 0;
        for (int i : arr) {
            sum += i;
            n++;
        }
        // arr.length can also be used
        int arg = sum / n;
        return arg;
    }

    public static void main(String[] args) {
        System.out.println("The average of 1, 2 & 3 is: " + avg(1, 2, 3));
    }
}