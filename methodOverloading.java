class Calculator
{
    public int add(int n1, int n2, int n3, int n4)
    {
        return n1 + n2 + n3 + n4;
    }
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}
public class methodOverloading {
    public static void main(String ar[])
    {
        Calculator c = new Calculator();
        double r1 = c.add(12.36, 13);
        System.out.println(r1);
    }
}
