import java.util.*;

public class ScanDemo {
    public static void main(String args[]) {
        // System.in scans for input from console/ terminal/command prompt
        Scanner sc = new Scanner(System.in);

        // prompt for name
        System.out.print("Enter name>");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
    }
}