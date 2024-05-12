import java.util.Scanner;

public class ifelese 
{
    public static void main(String[] args) 
    {

        System.out.println("Enter your income:");
        Scanner sd = new Scanner(System.in);
        int a = sd.nextInt();

        if (a <= 250000) 
        {
            System.out.println("You do not have to pay any tax on your income");
        }
        else
        {
            System.out.println("You have to pay tax according to your income");
        }
        sd.close();
    }
}