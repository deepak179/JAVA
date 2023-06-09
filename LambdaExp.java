@FunctionalInterface
interface A
{
    void show(int i);
}

public class LambdaExp {
    public static void main(String[] args) {
        // No need to mention the type of variable in Lambda expression
        // Don't need to use round brackets if we are passing only 1 variable
        // No need of curly brackets of our method contains only single line of code
        // No new class file will be generated for lambda expressions

        // Lambda Expression ny the use of Functional Interface and Anonymous Inner Class

        A obj = i -> System.out.println("In Show " + i);   // It is similar to A obj = new A(){ sout("In show")};  -- By the use of lambda expression the no. of lines of code is reduced
        
        // A obj = (i) -> System.out.println("In Show " + i);
        // A obj = (i, j) -> System.out.println("In Show " + i + j);
        // A obj = (i, j) -> {
        //    System.out.println("In Show " + i);
        //    System.out.println("In Show " + j);
        //};

        obj.show(5);
    }
}
