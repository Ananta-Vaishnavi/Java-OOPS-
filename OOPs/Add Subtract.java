import util.java.*;
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
    int divide(int num1, int num2)
    {
        return num1/num2;
    }
    int multiply(int num1, int num2){
        return num1*num2;
    }
}

class ArithmeticOperations{
    public static void main (String[] args)
    {
        Arithmetic op1 = new Arithmetic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(op1.add(a,b));
        System.out.println(op1.subtract(a,b));
        System.out.println(op1.divide(a,b));
        System.out.println(op1.multiply(a,b));
    }
}
