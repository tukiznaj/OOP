import java.util.*;

public class Ques3 {
    public static void println(String x) { // method to do System.out.println
        System.out.println(x);
    }

    public static void print(String x) { // method to do System.out.print
        System.out.print(x);
    }

    public static boolean matchStrings(String str1, String str2) {
        for (char ch2 : str2.toCharArray()) {
            for (char ch1 : str1.toCharArray()) {
                if (ch2 == ch1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printMatched(String str1, String str2) { // method to print all the matched characters from 2 inputs
        int pos = 0;
        int list[] = new int[str2.length()];

        for (char ch2 : str2.toCharArray()) { // loop to store search term in list array
            list[pos] = str1.indexOf(ch2);
            pos++;
        }

        String x = "";
        for (int i = 0; i < str1.length(); i++) { // create a set of spaces according to str1 length
            x += " ";
        }

        StringBuilder snew = new StringBuilder(x);
        for (int i = 0; i < list.length; i++) {
            snew.setCharAt(list[i], str1.charAt(list[i])); // replace the character at specific positions with str1 characters
        }
        System.out.println(snew);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("Enter the first string:");
        String input1 = sc.nextLine();
        print("Enter the second string:");
        String input2 = sc.nextLine();
        println("");

        if (matchStrings(input1, input2)) {
            println(input1);
            printMatched(input1, input2);
            println("There is an alignment as shown above.");
        } else {
            println("No alignment can be found");
        }
    }
}