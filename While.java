public class While
{
    public static void main(String ar[])
    {
        //while

        int i = 1;
        while(i<=4)
        {
            System.out.println("Hi " + i);
            int j=1;
            while(j<=2)
            {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye " + i);

        //do while
        int k = 5;
        do
        {
            System.out.println("Dimple " + k);
            k++;
        }while(k<=4);
    }
}