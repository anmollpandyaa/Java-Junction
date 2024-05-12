import java.util.Scanner;
public class exception {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num = x.nextInt();
        System.out.print("Enter number 2: ");
        int numm = x.nextInt();

        try 
        {
            int result = num/numm;
            System.out.println("The Answer is: " + result);
        }
         catch (Exception e) 
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Operation Complete.");
        }
    }
}
