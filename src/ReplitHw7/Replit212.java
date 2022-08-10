package ReplitHw7;
import java.io.*;
public class Replit212 {
    /*
    Create a method that will not be handling exception and throwing it at caller.

In main method call method and handle the exception.

Expected Output:

java.io.FileNotFoundException:  (No such file or directory)
     */
    private static final String filename = "";
    public static void main(String[] args) {
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader(new File(filename)));
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
