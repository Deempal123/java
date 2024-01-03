import tools.AdvCalc;

class VeryAdvCalc extends AdvCalc
{
    public double power(int n1, int n2)
    {
        return Math.pow(n1,n2);
    }
}
public class multilevelInheritance {
    public static void main(String ar[])
    {
        VeryAdvCalc obj = new VeryAdvCalc();
        double r5 = obj.power(7,3);
        System.out.println(r5);
    }
}
//here we have used class 'AdvCalc' which we have created previously
//'VeryAdvCalc' is inheriting 'AdvCalc' which is inheriting 'Calc' this is called multilevel inheritance 