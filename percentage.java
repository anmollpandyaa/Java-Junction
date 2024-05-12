import java.util.Scanner;

public class percentage{
    public static void main(String[] args) {
        System.out.println("PERCENTAGE CALCULATOR");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks 1:");
        int a = sc.nextInt();
        System.out.println("Enter marks 2:");
        int b = sc.nextInt();
        System.out.println("Enter marks 3:");
        int c = sc.nextInt();
        System.out.println("Enter marks 4:");
        int d = sc.nextInt();
        System.out.println("Enter marks 5:");
        int e = sc.nextInt();

        float percentage = ((a + b + c + d + e)/300f)*100;

        System.out.print("Percentage is:");
        System.out.print(percentage);
        sc.close();
    }
}