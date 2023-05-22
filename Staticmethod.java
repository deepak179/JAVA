class Mobile
{
    String brand;
    int price;
    static String type;
    String name;

    public void show()
    {
        System.out.println(brand + " " + name + " : " + price);
        System.out.println("It is a " + type);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " " + obj.name + " : " + type);
    }
}

public class Staticmethod {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 20000;
        m1.name = "Galaxy A52";
        Mobile.type = "Samrtphone";

        Mobile m2 = new Mobile();
        m2.brand = "Google";
        m2.price = 30000;
        m2.name = "Pixel 6a";

        m1.show();
        Mobile.show1(m2);
    }
}
