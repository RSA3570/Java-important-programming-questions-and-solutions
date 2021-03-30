import java.util.Scanner;

public class FindASCII {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        int ascii = ch;
        // You can also cast char to int
        //int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        //System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
