import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);

        System.out.println("Enter your designation");
        String des = sd.nextLine();

        switch (des) {
            case "Manager":
                System.out.println("You have to check for deadline");
                break;

            case "CEO":
                System.out.println("You have to talk to Investor");
                break;

            case "Investor":
                System.out.println("You have to visit office today");
                break;

            default:
                System.out.println("Ask Mr. Kapoor for your duties");
                break;
        }

        sd.close();

    }
}