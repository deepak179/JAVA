@FunctionalInterface      // Interface which has only one abstract method
interface A
{
    void show();
}

// class B implements A 
// {
//     public void show()
//     {
//         System.out.println("In Show...");
//     }
// }

public class Functionalinterface {
    public static void main(String[] args) {
        A obj = new A()
        {                          // instantiate A obj with the help of Anonymous Inner Class
            public void show()
            {
                System.out.println("In Show...");
            }
        };
        obj.show();
    }
}
