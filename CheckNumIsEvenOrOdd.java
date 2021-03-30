import java.util.Scanner;

public class CheckNumIsEvenOrOdd {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter an integer: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        // true if num is perfectly divisible by 2
        if(num % 2 == 0)
            System.out.print(num+" is even.");
        else
            System.out.print(num+" is odd.");
    }
    
}
