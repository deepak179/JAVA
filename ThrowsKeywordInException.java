class A {
    public void show() throws ClassNotFoundException {         // The exception is not handled by the show function it throws the exception
        Class.forName("Demo");
    }
}

public class ThrowsKeywordInException {
    public static void main(String[] args) {
        A obj = new A();

        try {
            obj.show();       // Exception ny show method is handled in try catch block in main method
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
