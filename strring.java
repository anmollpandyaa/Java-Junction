import java.util.Scanner;
public class strring {
    public static void main(String[] args) {
        System.out.printf("Welcome!\n");
        System.out.format("Enter a string: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.format(name);
        sc.close();
    }
}
