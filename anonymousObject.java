class A{
    public A()
    {
        System.out.println("object created");
    }

    public void show()
    {
        System.out.println("in A's show()");
    }
}

public class anonymousObject {
    public static void main(String ar[])
    {
        new A().show(); //Anonymous Object
        new A().show(); //we can't use anonymous object more than once however this line will not create any error but it will create new object 
                        //every time it will be written.
    }
}
