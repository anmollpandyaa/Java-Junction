import java.util.Scanner;
public class enhanced_switch {
    public static void main(String[] args) {
        System.out.println("Welcome! enter your designation to know your duty for today:");
        Scanner sd = new Scanner(System.in);
        String des = sd.nextLine();

        switch(des)
        {
            case "manager" -> System.out.println("Check for deadline");
            case "ceo" -> System.out.println("Attend meeting at 12:00");
            case "engineer" -> System.out.println("Test yesterday's developed code");
            case "hr" -> System.out.println("Take interviews scheduled for today");
            default -> System.out.println("Ask Mr. Kapoor for your today's work");
        }

        System.out.print("Thank You!");
        sd.close();
    }
}