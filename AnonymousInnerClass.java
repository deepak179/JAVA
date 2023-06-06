class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}

public class AnonymousInnerClass
{
    public static void main(String[] args) {
        A obj = new A()
        {                            // Anonumous Inner class with no name and new implementation for object 'obj'
            public void show()
            {
                System.out.println("In new show");
            }

        };

        obj.show();            // obj will execute the new implementaion
    }
}