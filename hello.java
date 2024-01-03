
class hello
{
    public static void main(String ar[])
    {
        long l = 5854l;
        System.out.println(l);
        float f = 6.5f;
        int i = 0b101;
        System.out.println(i);
        byte b = 127;
        int a = 129;
        //b = a;
        a = b;//implicit conversion(byte to integer)
        b = (byte)a;//type casting(Explicit conversion/integer to byte)
        System.out.println(b);
        int a1 = 260;
        b = (byte)a1;
        System.out.println(b);
        //arithmatic operator....."+, -, *, /, %"
        //logical........."&&, ||, !"
        //Conditional operator......."<, >, ==, !=, <=, >="
        //string is not supported by java in the version less than 5
        
    }
}