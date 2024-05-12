import java.util.Scanner;

public class Main {

    static long finalElementValue(int N, int[] A) {
        boolean aliceTurn = true;
        int left = 0;
        int right = N - 1;
        long finalValue = 0;

        while (left < right) {
            if (aliceTurn) {
                finalValue += Math.abs(A[left]);
                left++;
            } else {
                finalValue -= A[left];
                left++;
            }
            aliceTurn = !aliceTurn; 
        }
        return finalValue;
    }

	public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine(); 

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            scanner.nextLine(); 

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            scanner.nextLine(); 

            System.out.println(finalElementValue(N, A));
        }

        scanner.close();
    }
}
