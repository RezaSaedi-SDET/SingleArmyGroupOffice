package ReplitHw7;

public class Replit211 {
    /*
    Create a program that will handle exception to match below output:

Expected Output:

java.lang.ArrayIndexOutOfBoundsException: 4
	at Main.main(Main.java:5)
     */
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            for (int i = 3; i <= arr.length; i++) {
                System.out.println(arr[i + 1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
