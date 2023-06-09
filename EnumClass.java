enum Laptop
{
    Macbook(2000), XPS(1700), Vivobook(900), Surface(1500), Thinkpad(1450);           // Objects of Enum with arguments passed to them

    private int price;

    private Laptop(int price)   // We are using private constructor because the objects are declared in the class itself
    {
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }
    
    private Laptop() {
        price = 500;
        System.out.println("in Laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumClass {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
