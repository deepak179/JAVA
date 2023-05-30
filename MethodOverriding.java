class Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}

class AdvCalc
{
    public int add(int n1, int n2)      // Method overriding - add method overrides the add method provided by parent class Calc 
    {
        return n1 + n2 + 1;
    }
}



public class MethodOverriding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(4, 5));
        
    }
}
