class MyException extends Exception {                 // Custom exception
    public MyException(String message) {              // Constructor of our exception
        super(message);                               // Constructor of super class will be called to handle the fuctioning of message passed
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 21;
        int j = 0;

        try {
            j = 18/i;
            if (j == 0)
                throw new MyException("The quotient is 0");     // It will raise exception based on some condition
        }
        catch (MyException e) {
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