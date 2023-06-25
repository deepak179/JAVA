public class ThrowInException {
    public static void main(String[] args) {
        int i = 21;
        int j = 0;

        try {
            j = 18/i;
            if (j == 0)
                throw new ArithmeticException("The quotient is 0");     // It will raise exception based on some condition
        }
        catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("This is the default output in case of exception " + e);
            System.out.println(j);
        }
        catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }

        System.out.println("Bye!");
    }
}
