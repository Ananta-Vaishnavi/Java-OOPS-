import java.util.*;
class Arithmetic{
    int num1;
    int num2;
    
    int add(int num1, int num2)
    {
        return num1+num2;
    }
    int subtract(int num1, int num2){
        return num1-num2;
    }
    int multiply(int num1, int num2)
    {
        return num1*num2;
    }
    int division(int num1, int num2)
    {
        return num1/num2;
    }
}


class StringOperations{
    public static void main (String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        Arithmetic op = new Arithmetic();
        System.out.println(op.add(Integer.parseInt(n1), Integer.parseInt(n2)));
        System.out.println(op.subtract(Integer.parseInt(n1), Integer.parseInt(n2)));
        System.out.println(op.multiply(Integer.parseInt(n1), Integer.parseInt(n2)));
        System.out.println(op.division(Integer.parseInt(n1), Integer.parseInt(n2)));
    }
}
