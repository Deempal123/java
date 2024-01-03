public class Switch
{
    public static void main(String args[])
    {
        // java 12 introduced new switch statement or updated switch statement

        int n = 4;
        switch(n)
        {
            case 1 : System.out.println("Monday");
                    break;
            case 2, 3, 4 : System.out.println("Sunday");//older version of switch in which it is compulsory to put break for the proper functioning of switch
                    break;
                    
        }

        String s = "Monday";
        switch(s)
        {
            case "Sunday" -> System.out.println("Holyday");
            case "Monday", "Tuesday", "Wednesday" -> System.out.println("It's a working day");//newer version of switch in which we need not put break after each statement
        }

        // String result = switch(n)
        // {
        //     case 1 -> return "error";
        //     case 4 -> return "gotit";
        // };
        // System.out.println(result);

    }
}