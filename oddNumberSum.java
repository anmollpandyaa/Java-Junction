public class oddNumberSum {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i = i + 2) 
        {
            if ((i / 2) * 2 != i) 
            {
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers from 1 to 100 is: " + sum);
    }
}