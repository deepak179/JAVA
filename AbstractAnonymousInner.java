abstract class A
{
    public abstract void show();
}

public class AbstractAnonymousInner {
    public static void main(String[] args) {
        // We can't create object of Abstract Class

        A obj = new A()        // This is not hte object of Abstract class it is the object of newly ddefined Anonymous Inner class
        {
            public void show()
            {
                System.out.println("In the show of Anonymous Inner Class");
            }
        };

        // When we have abstract class or interface we use this concept of Anonymous Inner Class when we have to implement Abstract class or Interface only once

        obj.show();
    }
}
