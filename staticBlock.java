//static block will be called only once irrespective of how many objects you create
//static block is called first
//whenever we create any object, two steps folowed first the class will load and then the object will get instantiated but class will be loaded obly once no matter how many objects we are creating
//so basically our jvm has a special area called class loader in which the class is going to be loaded when you create the first object
//now every time you load the class it will call the static block and the it will call the constructor that's why the static block is called first
//since the loading process comes first the static block will called first
//but what if we dont create any object?.....simple it will not gonna load the class as well
//again what if we want to load the class without creating any object?..see line 34
class phone{
    String brand;
    int price;
    static String type;

    static
    {
        type = "SmartPhone";
        System.out.println("in static");

    }

    public phone()
    {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }
}
public class staticBlock {
    public static void main(String ar[]) throws ClassNotFoundException
    {
        //since we are creating two objects the constructor will be called twice but the static block will be called once only
        //phone obj1 = new phone();
        //phone obj2 = new phone();
        Class.forName("phone");//it will load the class 
    }
    
}
