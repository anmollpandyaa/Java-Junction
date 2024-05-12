public class arrmaxvalue {
    public static void main(String[] args) {
        int[] arr = { 34, 96, 47, 56, 40 };

        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.print(max + " is the largest element in the array");
    }
}