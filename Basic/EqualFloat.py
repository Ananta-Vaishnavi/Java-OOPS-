import java.text.DecimalFormat;
import java.util.Scanner;

class EqualFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first floating-point number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second floating-point number: ");
        float num2 = sc.nextFloat();

        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(java.math.RoundingMode.FLOOR);

        String strNum1 = df.format(num1);
        String strNum2 = df.format(num2);

        if (strNum1.equals(strNum2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
