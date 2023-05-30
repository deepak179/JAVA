class A
{
    public A()
    {
        System.out.println("Object creatd");
    }
    public void show()
    {
        System.out.println("In show");
    }
}

public class AnonymousObj {
    public static void main(String[] args) {
        new A().show();        // Anonymous Object
        // It can be used only once
    }
}
