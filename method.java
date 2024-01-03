class computer
{
    public void playMusic()
    {
        System.out.println("Playing Music....");
    }

    public String getMePen(int cost)
    {
        if(cost >= 10)
            return "Pen";
        return "Got Nothing..!";
    }
}

public class method {
    public static void main(String ar[])
    {
        computer c = new computer();
        c.playMusic();
        System.out.println(c.getMePen(8));
    }
    
}
