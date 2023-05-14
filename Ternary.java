public class Ternary {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int z = 2;

        int result = 0;

        //if (n%2 == 0)
        //    result = "Even";
        //else
        //    result = "Odd";

        result = (x > y) ? (x > z ? x : z) : (y > z ? y : z);         // Ternary operator

        System.out.println(result);
    }
}
