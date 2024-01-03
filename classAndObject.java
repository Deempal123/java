class Calculator
{
    int a;
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        System.out.println("addition is going on");
        return r;
    }
}
public class classAndObject {

    public static void main(String ar[])
    {
        Calculator c = new Calculator();
        int result = c.add(9,8);
        System.out.println("And the sum is "+result);

    }
}
