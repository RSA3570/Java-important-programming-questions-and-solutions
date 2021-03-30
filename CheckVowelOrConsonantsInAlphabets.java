import java.util.Scanner;

class CheckVowelOrConsonantsInAlphabets{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        char ch = scn.next().charAt(0);

        if (ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println(ch+" is vowel.");
        }else{
            System.out.println(ch +" is consonants");
        }

        //Method: 2:-

        // switch (ch) {
        //     case 'a':
        //     case 'e':
        //     case 'i':
        //     case 'o':
        //     case 'u':
        //         System.out.println(ch + " is vowel");
        //         break;
        //     default:
        //         System.out.println(ch + " is consonant");
    }
}