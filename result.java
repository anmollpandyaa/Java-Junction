import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        System.out.println("Enter your marks to check your result-");
        Scanner sd = new Scanner(System.in);

        System.out.println("Enter marks in Mathematics:");
        byte a = sd.nextByte();
        System.out.println("Enter marks in DSA:");
        byte b = sd.nextByte();
        System.out.println("Enter marks in Design Thinking:");
        byte c = sd.nextByte();
        System.out.println("Enter marks in Agile:");
        byte d = sd.nextByte();
        System.out.println("Enter marks in Data Communication:");
        byte e = sd.nextByte();

        float avg = (a + b + c + d + e) / 300.0f * 100;

        System.out.println("PERCENTAGE - " + avg);
        if (avg >= 50 && a >= 24 && b >= 24 && c >= 24 && d >= 24 && e >= 24) {
            System.out.println("RESULT - PASS\nCongratulations!");
        } else {
            System.out.println("RESULT - FAIL\nBetter luck next time.");
        }
        sd.close();
    }
}