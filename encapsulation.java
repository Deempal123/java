//you can consider a capsule which consists of powdered medicine with some coating and that coating hides the powdered medicine the same way in encapsulation the details are hidden and only the data is visible
//once we create any instance variable using private access specifier we can not access it from anywhere it will be accessible only within the scope(or class in which it is defined or created)
//once we made the varible private we can't access it from outside world directly so we can access it indirectly like through method and all

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

    public void setAge(int a)
    {
        age = a;
    }
}

public class encapsulation {
    public static void main(String ar[])
    {
    human obj = new human();
    //obj.name = "Deempal";
    //obj.age = 25;
    obj.setName("Deempal");
    obj.setAge(25);
    //System.out.println(obj.name + " : " + obj.age); //so, we are getting error at this line because we are trying to access private member "name" and "age" outside the class they are defined in. 

    System.out.println(obj.getName() + " : " + obj.getAge()); //here's how we can access private member outside the class through methods of the same class only

    //now we want to set the value in main body instead of initiated while creation see line 20 and 38.
    }
}
