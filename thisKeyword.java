class human
{
    private String name = "Deempal";
    private int age = 25;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String n)
    {
        name = n;
        
    }
    ///now suppose if we have the same variable name for both instance and local variables the preference will be given to local variable always and 
    //what exactly will happen here is the local variable will initialise itself and we get zero here so to deal with this issue we have a keyword 
    //"this" refers to the current object calling the method
    public void setAge(int age)
    {
        this.age = age;
    }
}

public class thisKeyword {
    public static void main(String ar[])
    {
    human obj = new human();
    
    obj.setName("Deempal");
    obj.setAge(25);
     

    System.out.println(obj.getName() + " : " + obj.getAge()); 
    }   
}
