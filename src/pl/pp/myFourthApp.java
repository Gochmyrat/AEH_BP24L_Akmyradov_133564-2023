package pl.pp;
import java.util.Scanner;
public class myFourthApp {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.print("Enter lower and upper integer limits: ");
                    int lowerLimit = scanner.nextInt();
                    int upperLimit = scanner.nextInt();

                    if (upperLimit <= lowerLimit) {
                        System.out.println("Done");
                        break;
                    }

                    int sumOfSquares = 0;

                    for (int i = lowerLimit; i <= upperLimit; i++) {
                        sumOfSquares += i * i;
                    }

                    System.out.println("The sums of the squares from " + (lowerLimit * lowerLimit) + " to " + (upperLimit * upperLimit) + " is " + sumOfSquares);
                }

                scanner.close();
            }
        }

