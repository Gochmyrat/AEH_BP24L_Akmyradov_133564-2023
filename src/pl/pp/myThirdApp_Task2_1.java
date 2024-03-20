package pl.pp;
import java.util.Scanner;
public class myThirdApp_Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number of days: ");
            int days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("Exiting");
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;

            System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days.");
        }

        scanner.close();
    }
}
