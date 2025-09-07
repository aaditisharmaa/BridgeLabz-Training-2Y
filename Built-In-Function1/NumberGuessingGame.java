import java.util.*;

class NumberGuessingGame {
    public static int generateGuess(int low, int high) {
        return new Random().nextInt(high - low + 1) + low;
    }

    public static String getFeedback(Scanner sc, int guess) {
        System.out.print("Is " + guess + " too high, too low, or correct? ");
        return sc.next().toLowerCase();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback = "";
        while (!feedback.equals("correct")) {
            int guess = generateGuess(low, high);
            feedback = getFeedback(sc, guess);
            if (feedback.equals("low")) low = guess + 1;
            else if (feedback.equals("high")) high = guess - 1;
        }
        System.out.println("Yay! I guessed your number.");
    }

    public static void main(String[] args) {
        playGame();
    }
}

