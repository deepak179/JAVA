class Calc
{
    public final void show()
    {
        System.out.println("In Calc show");
    }
    public void add(int n, int m)
    {
        System.out.println(n + m);
    }
}

// final class Calc
// class AdvCalc extends Calc  // It is not possible as Calc class is made final, so it can't be inherited by other classes
class AdvCalc extends Calc
{
    public void show()   // It is not possible as show mwthod is made final in Calc class, so it can't be overridden
    {
        System.out.println("In AdvCalc show");
    }
}


public class Final {
    public static void main(String[] args) {
        // final int num = 5;     // variable is made final so it can't be changed.
        // num = 4;    // It is not possible as num is final

    }
}
