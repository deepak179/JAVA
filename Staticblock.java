class Mobile
{
    String brand;
    int price;
    static String type;
    String name;    

    static                           // static block - It will be executed only once when the class is loaded.
                                     // It is used to initialize static variables
    {
        type = "Smartphone";
        System.out.println("In static block...");
    }

    public Mobile(String b, int p, String n)                        // constructor
    {
        brand = b;
        price = p;
        name = n;
        System.out.println("In constructor");
    }

    public void display()
    {
        System.out.println(brand + " " + name + " : " + type);
    }
}


public class Staticblock {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile("Samsung", 22000, "Galaxy A52");
        Mobile obj2 = new Mobile("Google", 30000, "Pixel 6a");
        Mobile obj3 = new Mobile("Apple", 60000, "iphone 13");
        obj1.display();
        obj2.display();
        obj3.display();


        // Class.forName("Mobile");    // for loading the class without creating the object
    }
}
