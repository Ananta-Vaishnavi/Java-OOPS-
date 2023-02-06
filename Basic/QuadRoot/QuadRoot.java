import java.lang.Math;
import java.util.*;

class QuadRoot {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, D;
        System.out.println("Enter the values of a,b ,c in a^2 + b + c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = (Math.pow(b,2) - 4*a*c);
        if (d > 0) {
            System.out.println("There are two roots for the quadratic equation");
            D = Math.sqrt(d);
            System.out.println((-b - D) / (2 * a) + " " + (-b + D) / (2 * a));
        }
        if (d == 0) {
            System.out.println("There is only one root");
            System.out.println(-b / (2 * a));
        }
        if (d < 0) {
            System.out.println("There is no real root");
        }
    }
}
