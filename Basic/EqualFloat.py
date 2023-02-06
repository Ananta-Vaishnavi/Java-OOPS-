import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();

        int num1Int = (int) (num1 * 1000);
        int num2Int = (int) (num2 * 1000);

        if (num1Int == num2Int) {
            System.out.println("The numbers are equal up to three decimal places.");
        } else {
            System.out.println("The numbers are not equal up to three decimal places.");
        }
    }
}
