public class Logicalop 
{
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int x = 10;
        int y = 20;

        //boolean result = x > y && a < b;      //AND operator
        boolean result = x > y || a < b;      // OR operator
        System.out.println(!result);          // NOT operator
    }
}
