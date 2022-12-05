
/**
 * NumberGussingGame
 */
import java.util.*;

public class NumberGuessingGame {

    private static final Random r = new Random();
    private static final int Number = r.nextInt(100) + 1;
    private static int guess = 0;
    public static Scanner sc = new Scanner(System.in);
    public static String Player_name;
    static NumberGuessingGame gc = new NumberGuessingGame();

    public static void main(String[] args) {

        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("|| Welcome To Number Guessing Game ||");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("|| Follow The Game Rules ||");
        System.out.println("-------------------------------------");
        System.out.println("1. You Have To Enter Number Between 1 to 100 Only.");
        System.out.println("--------------------------------------------------");
        System.out.println("2. You Have 5 Attempts Only.");
        System.out.println("-----------------------------");
        // System.out.println("3. If You Guess The Number Under 5 Attempts You Will be Qualified For Next Round.");
        // System.out.println("----------------------------------------------------------------------------------");
        // System.out.println("4. If You have been qualified for next round your attempts will be decided on your score.");
        // System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Enter  Your Name: ");
        Player_name = sc.next();
        System.out.println("Hello, " + Player_name + " Best Of Luck For Your Game.");
        System.out.println();
        gc.NumberGuessingGame1();
    }

    public void NumberGuessingGame1() {
        int attempts = 5;

        while (guess != Number) {

            if (attempts <= 0) {
                System.out.println("Sorry You Failed You Have Used 5 Attempts..!");
                break;
            }
            System.out.print("Enter A Number: ");
            guess = sc.nextInt();
            if (guess > Number) {
                System.out.println("To High ");
            } else if (guess < Number) {
                System.out.println("To Low");

            } else if (guess == Number) {
                if (attempts == 5) {
                    System.out.println("Congratulations " + Player_name + " Your Guess Is Right...!");
                    System.out.println("Your Score Is 100%");
                    // System.out.println("Your Prequalified For Next Round");
                    // System.out.println("Your Attempts Are Increased By 2 For Next Round.");
                    // System.out.println("|| Congratulations " + Player_name + " Your Playing Next Round ||");
                    // gc.NumberGuessingGame1(7);
                }
                if (attempts == 4) {
                    System.out.println("Congratulations " + Player_name + " Your Guess Is Right...!");
                    System.out.println("Your Score Is 80%");
                    // System.out.println("Your Prequalified For Next Round");
                    // System.out.println("Your Attempts Are Increased By 1 For Next Round.");
                    // System.out.println("|| Congratulations " + Player_name + " Your Playing Next Round ||");
                    // gc.NumberGuessingGame1(6);
                }
                if (attempts == 3) {
                    System.out.println("Congratulations " + Player_name + " Your Guess Is Right...!");
                    System.out.println("Your Score Is 50%");
                    // System.out.println("Your Prequalified For Next Round.");
                    // System.out.println("Your Attempts Are Equal For Next Round.");
                    // System.out.println("|| Congratulations " + Player_name + " Your Playing Next Round ||");
                    // gc.NumberGuessingGame1(5);
                }
                if (attempts == 2) {
                    System.out.println("Congratulations " + Player_name + " Your Guess Is Right...!");
                    System.out.println("Your Score Is 30%");
                    // System.out.println("Your Prequalified For Next Round");
                    // System.out.println("Your Attempts Are Decreased By 1 For Next Round.");
                    // System.out.println("|| Congratulations " + Player_name + " Your Playing Next Round ||");
                    // gc.NumberGuessingGame1(4);
                }
                if (attempts == 1) {
                    System.out.println("Congratulations " + Player_name + " Your Guess Is Right...!");
                    System.out.println("Your Score Is 10%");
                    // System.out.println("Your Prequalified For Next Round");
                    // System.out.println("Your Attempts Are Decreased By 2 For Next Round.");
                    // System.out.println("|| Congratulations " + Player_name + " Your Playing Next Round ||");
                    // gc.NumberGuessingGame1(3);
                }

            }

            attempts--;
            if (guess != Number) {
                System.out.println("You Have Only " + attempts + " Attempts Left!");
            }
        }
    }
}
