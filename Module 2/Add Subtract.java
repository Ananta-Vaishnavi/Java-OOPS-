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
}

class ArithmeticOperations{
    public static void main (String[] args)
    {
        Arithmetic op1 = new Arithmetic();
        
        System.out.println(op1.add(10,20));
        System.out.println(op1.subtract(10,20));
    }
}
