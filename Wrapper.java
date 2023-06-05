public class Wrapper {
    public static void main(String[] args) {
        int num1 = 7;
        // Integer num2 = new Integer(7);   // boxing - Storing/Passing primitive data in its wrapper class object
        // Integer num3 = new Integer(num1);   // boxing

        // Integer num4 = num1;      // Autoboxing
        Integer num5 = 7;

        System.out.println(num5);

        int num2 = num5.intValue();   // Unboxing - Value from object type to primitive type
        int num3 = num5;       // Auto-unboxing

        System.out.println(num3);

        String str = num5.toString();     // The Integer object will be converted to string
        String st = "12";
        int num4 = Integer.parseInt(st);
        System.out.println(num4 * 4);
    }
}
