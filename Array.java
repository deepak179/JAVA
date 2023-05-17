public class Array {
    public static void main(String[] args) 
    {
        
        // int[] arr = {1, 2, 3};
        // arr[1] = 6;
        // System.out.println(arr[0]);

        int num[] = new int[4];                // Dynamic array - Values are not initialized at the time of creation of array
        num[0] = 4;
        num[1] = 2;
        num[2] = 8;
        num[3] = 6;

        for (int i = 0; i < num.length; i++) 
        {
            System.out.println(num[i]);
        }
    }
}
