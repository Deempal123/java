//static means common to all for example if we create a variable and make it as static it will be shared by all the objects means if we are creating two objects and changing the value of static variable for object1 the change will be reflected for the object2 also

class phone{
    String brand;
    int price;
    static String type; //static varible

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + type);
    }
}

public class jstatic {
    public static void main(String ar[])
    {
        phone obj1 = new phone();
        obj1.brand = "Apple";
        obj1.price = 1500;
        //obj1.type = "Smart Phone";

        phone obj2 = new phone();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        //obj2.type = "Smart Phone";

        //obj1.type = "Phone"; //here we have changed the "type" for obj1 only but it will be reflect for obj2 also as "type" is a static variable
        phone.type = "Phone"; //static varible can called with class name also
        obj1.show();
        obj2.show();
    }
}
