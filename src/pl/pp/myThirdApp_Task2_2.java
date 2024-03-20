package pl.pp;
import java.util.Scanner;
public class myThirdApp_Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = scanner.nextDouble();

            if (celsius == -1) {
                System.out.println("Exiting");
                break;
            }

            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("%.2f Celsius is %.2f Fahrenheit and %.2f Kelvin.%n", celsius, fahrenheit, kelvin);
        }

        scanner.close();
    }
}
