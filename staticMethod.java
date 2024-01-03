//if we are working with non static method we have to call it through object but if we are creating a static method it can be called through class name also
//if we call a non static method through class name it will produce an error
//we can use only static varible inside a static method, non static variable will produce error if used inside a static method

class phone{
    String brand;
    int price;
    static String type; //static varible

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + type);
    }

    public static void show1()
    {
        //System.out.println(brand + " : " + price + " : " + type); //we can see here, nonstatic variables inside the static method are indicating error because static method is shared by all objects and that is why in this statement it is not possible to track that for which object it is going to work
        System.out.println("Inside show1()");
        System.out.println(type); //using static variable only just avoid the error
    } 
    
    //we can use the non static variable here only through the reference of object
    //lets create a new one to understand it clearly

    public static void show2(phone obj)
    {
        System.out.println("Inside show2()");
        System.out.println(obj.brand + " : " + obj.price + " : " + type);
    }
}

public class staticMethod {
    public static void main(String ar[])
    {
        phone obj1 = new phone();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.type = "Smart Phone";

        phone obj2 = new phone();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        obj2.type = "Smart Phone";

        obj1.type = "Phone"; 
        phone.type = "Phone";

        obj1.show();
        obj2.show();

        phone.show1(); //calling static method through class name
        phone.show2(obj1);//calling static method which is having non static variables through object reference

    }
    
}
