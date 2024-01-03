//constructor is a method who's name is same as the class name. it is called whenever an object is being created.
//never return any value so, we don't need to specify return type for constructor

//parameterised constructor is a constructor which takes arguments.

class human
{
    private String name;
    private int age;

    public human()  //default constructor
    {
        System.out.println("In Constructor....");
        name = "Balindra";
        age = 26;
    }

    public human(String n, int a)  //default constructor
    {
        System.out.println("In Parameterised Constructor....");
        name = n;
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

   
}

public class constructor {
    public static void main(String ar[])
    {
    human obj = new human();
    human obj1 = new human("vivek",27);
    System.out.println(obj.getName() + " : " + obj.getAge()); 
    System.out.println(obj1.getName() + " : " + obj1.getAge()); 
    }   
}
