public class method {
    static int add(int x, int y)
    {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        int num1, num2;
        num1 = 1;
        num2 = 4;

        int sum;
        sum = add(num1, num2);
        System.out.println(sum);
    }
}