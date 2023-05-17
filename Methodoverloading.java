class Calculator
{

    int num = 5;         // instance variable

    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
}

public class Methodoverloading {
    public static void main(String[] args) {
        
        Calculator obj = new Calculator();
        int result = obj.add(7, 14, 7);
        System.out.println(result);
    }
}
