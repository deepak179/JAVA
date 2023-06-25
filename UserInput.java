import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class UserInput {
    // user input can be taken by the help of BufferedReader class or Scanner class
    // BufferedReader class - In this we have to pass the object of InputStream to BufferedReader object. We also have to pass System.in to the object of InputStream class
    // Scanner class - In this we have to pass the static object in of System class i.e., System.in

    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.print("Enter a number: ");

        // Scanner sc = new Scanner(System.in);
        // System.out.println(sc.nextInt());

        // OR

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        System.out.println(Integer.parseInt(bf.readLine()));
        bf.close();
    }
}
