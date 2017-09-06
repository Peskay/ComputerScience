import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Cryptography {

    public static String encrypt(String inEn) {
        String outEn = "";
        for (int i = inEn.length(); i > 0; i--) {
            char c = inEn.charAt(i - 1); 
            outEn += c;
            int randomNum = ThreadLocalRandom.current().nextInt(0, 100);
            outEn += (char) randomNum;
        }
        return outEn;
    }

    public static String decrypt(String inDe) {
        String outDe = "";
        for (int i = inDe.length(); i > 0; i--) {
            char c = inDe.charAt(i - 1);
            if ((i-1) % 2 == 0) {
                outDe += c;
            }
        }      
        return outDe;
    }
    
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to encrypt or decrypt? Enter e or d ");
        String choice = sc.nextLine();

        if (choice.equals("e")) {
             System.out.println("Enter a string you want to encrypt");
             String inEn = sc.nextLine();
             System.out.println(encrypt(inEn));

        } else if (choice.equals("d")) {
            System.out.println("Enter a string you want to decrypt");
            String inDe = sc.nextLine();
            System.out.println(decrypt(inDe));

        } else {
            System.out.println("You entered something besides e or d!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!, bye");
            System.exit(0);
        }
    }
}