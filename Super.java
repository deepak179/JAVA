// In this code the use of this() method and super() method is demonstrated.
// this() method executes the contructor of same class
// super() method executes the constructor of super class to which the class extends
// by default the class is extend by Object class

class A
{
    public A()
    {
        System.out.println("in A");
    }

    public A(int n)
    {
        System.out.println("in A int");
    }
}

class B extends A
{
    public B()
    {
        // super(5);   // it calls the parameterized constructor of super class
        System.out.println("in B");
    }
    public B(int n)
    {
        // super(n);
        this();
        System.out.println("in B int");
    }
}

public class Super {
    public static void main(String[] args) {
        // B obj = new B();
        B obj1 = new B(5);
    }
}
