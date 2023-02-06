import java.util.Scanner;

public class scrabbleMain {
    public static void main(String[] args) {
        scrabbleScore scorer = new scrabbleScore();
        System.out.println("Enter the word in to calculate the scrabble score (- to exit):");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        while(!word.equals("")){
            System.out.println("The score for " + word + " is " + scorer.getScrabbleScore(word));
            System.out.println("Enter the word in to calculate the scrabble score (- to exit):");
            word = scanner.next();
        }
    }
}