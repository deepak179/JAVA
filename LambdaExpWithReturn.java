@FunctionalInterface
interface A
{
    int add(int i, int j);
}

public class LambdaExpWithReturn {
    public static void main(String[] args) {
        // A obj = new A(){
        //     public int add(int i, int j)
        //     {
        //         return i + j;
        //     }
        // };
        // A obj = (int i, int j) -> i + j;
        A obj = (i, j) -> i + j;

        System.out.println(obj.add(56, 5));
    }
}
