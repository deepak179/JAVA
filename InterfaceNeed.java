interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code, Compile, Run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code, Compile, Run : Faster");
    }
}

class Developer
{
    public void devApp(Computer comp)
    {
        comp.code();           // It will call the code method of that class of which the object is, the reference variable in both the cases is of interface Computer
    }
}

public class InterfaceNeed
{
    public static void main(String[] args) 
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer deepak = new Developer();
        deepak.devApp(desk);      
    }
}