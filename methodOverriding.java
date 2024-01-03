class calc
{
    int add(int n1, int n2)
    {
        return n1 + n2;
    }

    void config()
    {
        System.out.println("in A config");
    }
}

class advCalc extends calc
{
    int add(int n1, int n2)
    {
        return n1 + n2 + 1;
    }
}
public class methodOverriding {
    public static void main(String ar[])
    {
    advCalc obj = new advCalc();
    int r1 = obj.add(3,4);
    System.out.println(r1);
    obj.config();
}
    
}
