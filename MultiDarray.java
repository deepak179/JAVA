// import java.util.Random;

public class MultiDarray {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];
        // Random rand = new Random();

        for (int i=0; i<3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                // nums[i][j] = rand.nextInt(100) + 1;
                nums[i][j] = (int)(Math.random()*100);
            }
        }

        for (int i=0; i<3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for (int n[] : nums)                   // Enhanced for loop iteration
        {
            for (int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
