import java.util.Scanner;

public class FindStudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        String confirm;

        System.out.println("Greetings! Enter the following details to see your result.");

        do {
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();

            System.out.println("Enter marks:-");
            for (int i = 0; i < array.length; i++) {
                System.out.format("Subject %d: ", i + 1);
                array[i] = scanner.nextInt();
            }

            scanner.nextLine();

            int sum = 0;
            for (int i : array) {
                sum += i;
            }

            int percentage = sum / array.length;

            String result;
            if (percentage > 33 && percentage < 100) {
                result = "Pass";
            } else {
                result = "Fail";
            }

            System.out.println("Here is the result:");
            System.out.println("------------------------------------------------------");
            System.out.println("| Name: " + name + " | " + "Percentage: " + percentage + " | " + "Result: " + result + " |");
            System.out.println("------------------------------------------------------");

            System.out.println("Do you want to see another result? (y/n): ");
            confirm = scanner.nextLine();
        } while (confirm.equals("y"));

        System.out.println("Thank you!");
        scanner.close();
    }
}