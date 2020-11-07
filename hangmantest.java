import java.util.*;
public class hangmantest {
    public static void main() {
        promptForletters();
    }
    public static void promptForletters() {
        Scanner console = new Scanner(System.in); 
            System.out.println("How many letters? ");
            int numberOfletters = console.nextInt();
            hangman(numberOfletters);
        }
    
    public static void hangman(int numberOfletters) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabetElim = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        int guessCount = 0;
        int randomChar = 0;
        int location = 1;
        String word = "";
        while (count < numberOfletters) {
            Random a = new Random();
            Scanner console = new Scanner(System.in);
            char randomCharacter = alphabetElim.charAt(a.nextInt(alphabetElim.length()));
            System.out.println("Is letter # " + location + " " + randomCharacter + "?");
            String confirmation = console.next();
            if (confirmation.equals("yes")) {
                count++;
                alphabetElim = alphabet;
                guessCount++;
                word = word + randomCharacter;
                location++;
            } else {
                alphabetElim = alphabetElim.substring(0, randomChar) + alphabetElim.substring((randomChar + 1), alphabetElim.length());
                guessCount++;
        }
    }
    System.out.println("word is: " + word);
    System.out.println("it took me " + guessCount + " tries");
}
}









