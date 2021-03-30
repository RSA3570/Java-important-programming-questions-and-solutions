import java.util.Scanner;

public class CheckUpperCaseLowerCaseOrSymbol {
    public static void main(String[] args) {
        char ch;
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		if(ch >= 65 && ch <= 90)
			System.out.print(ch+" is in UpperCase");
		else if(ch >= 97 && ch <= 122)
			System.out.print(ch+" is in LowerCase");
		else if(ch >= 48 && ch <= 57)
			System.out.print(ch+" is a Number");
		else
			System.out.print(ch+" is a Symbol");
    }
}
