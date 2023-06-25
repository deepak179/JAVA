public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 2;         // Normal Statements
        int j = 0;

        String str = null;
        int nums[] = new int[5];

        try
        {
            j = 18/i;     // Critical Statements

            System.out.println(nums[1]);
            System.out.println(nums[5]);
            System.out.println(str.length());
        }

        catch(ArithmeticException e)
        {
            System.out.println("Number can't be divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your Limit");
        }
        catch(Exception e)      // Write catch block for Exception class object at last of all the exception
        {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);       // The statements after try and catch blocks will execute no matter if there is any exception or not
        System.out.println("Bye!");
    }
}
