//whenever we create any object it calls the constructor of both sub-class and super-class.

//now lets talk about inheritance so we have sub class as well as super class and in this case we should create the object of sub class
// that will call the super class constructor as well but why?
//because every constructor is by default having a keyword super() int the top of any statement which is responsible for calling the super class constructor
// again there is two condition which is, which constructor it will call default or parameter?
//so if we are passing the parameter while creating the object of sub class it will call the parameterised constructor of sub class but default constructor
//of super class because we are not passing any parameter to the "super()" function.
//if we want to call parameterised constructor of super class we have to pass parameter to the 'super()' keyword/function of sub class

class A{
    public A()
    {
        super(); //by default present in every constructor either we write or not. every class in java extends the object class of java 
                //so this 'super()' is calling the constructor of the object class in actual.
        System.out.println("in A");
    }

    public A(int a)
    {
        System.out.println("in A int");
    }    

}
class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }

    public B(int b)
    {
        this();
        System.out.println("in B int");
    }
}

//suppose we want to call both default and parameterised constructor by creating only one object
//so for this we need to use 'this' keyword which will call the constructor of the same class. see the line 35.

public class thisAndSuperKeyword {
    public static void main(String ar[])
    {
        B obj = new B(5);
    }
    
}
