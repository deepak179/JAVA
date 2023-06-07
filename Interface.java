
interface A
{
    int age = 23;               // Variables are final and static by default in interface
    String area = "Rewari";

    void show();             // Functions/methods are public and abstract by default in interface
    void config();

    // interface contains abstract methods only
}

interface B
{
    void run();
}

interface D extends A
{
    int sum(int a, int b);
}

class C implements D, B       // class B can only implement the methods of A not the variables
{
    public void show()
    {
        System.out.println("In show");
    }

    public void config()
    {
        System.out.println("In config");
    }

    public void run()
    {
        System.out.println("In run...");
    }

    public int sum(int a, int b)
    {
        return (a + b);
    }

    public int sub(int a, int b)
    {
        return (a - b);
    }
}

public class Interface {
    public static void main(String[] args) {
        C obj = new C();           // Reference variable of A can only implement the functions defined in A interface
        obj.show();
        obj.config();
        obj.run();

        System.out.println(A.age);
        System.out.println(A.area);
        System.out.println(obj.sum(6,24));
        System.out.println(obj.sub(24, 7));
    }
}
