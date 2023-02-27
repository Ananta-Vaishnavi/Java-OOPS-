import java.util.*;
class CompareOpearators
{
    void CompareThis(int a, int b)
    {
        if (a < b) 
        System.out.println(b+"is the greater than"+b);
        else if (a > b)
        System.out.println(a+"is the lesser than"+b);
        else
        System.out.println("both the values are equal");
    }
    void CompareThis(char a, char b)
    {
        if(Character.compare(a, b) > 0) {
            System.out.println(a+" is greater than d"+b);
        } else if(Character.compare(a, b) < 0) {
            System.out.println(a+" is lesser than"+b);
        } else
            System.out.println("They are are equal");
    }
    void CompareThis(String a, String b) {
        if(a.compareTo(b) > 0) {
            System.out.println(a+"is greater than"+b);
        } else if(a.compareTo(b) < 0) {
            System.out.println(a+"is lesser than"+b);
        } else
            System.out.println("They are are equal");
    }
}


class Comparision{
    public static void main (String[] args)
    {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two stings");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println("Enter two characters");
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        System.out.println("Enter two integers");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        CompareOpearators ob = new CompareOpearators();
        ob.CompareThis(s1,s2);
        ob.CompareThis(c1,c2);
        ob.CompareThis(i1,i2);
        
    }
}
