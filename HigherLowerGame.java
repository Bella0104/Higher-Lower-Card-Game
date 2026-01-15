import java.util.Scanner;

public class HigherLowerGame {
    private Deck deck;
    private int score;
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("=== Higher / Lower Card Game ===");
        System.out.println("Ace is high. Jokers = automatic win.");
        System.out.println("--------------------------------");

        deck = new Deck(true);
        score = 0;

        Card currentCard = deck.draw();

        while (true) {
            System.out.println("Current card: " + currentCard);
            System.out.print("Higher or Lower? (H/L): ");

            String guess = scanner.nextLine().trim().toUpperCase();
            if (!guess.equals("H") && !guess.equals("L")) {
                System.out.println("Please enter H or L only.");
                continue;
            }

            Card nextCard = deck.draw();
            if (nextCard == null) {
                deck = new Deck(true);
                nextCard = deck.draw();
            }

            System.out.println("Next card: " + nextCard);

            if (nextCard.isJoker()) {
                System.out.println("JOKER! Automatic win 🎉");
                score++;
            } else {
                boolean isHigher =
                        nextCard.getRank().getValue() > currentCard.getRank().getValue();

                if ((isHigher && guess.equals("H")) || (!isHigher && guess.equals("L"))) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong guess.");
                    break;
                }
            }

            System.out.println("Score: " + score);
            System.out.println("--------------------------------");
            currentCard = nextCard;
        }

        System.out.println("Game over. Final score: " + score);
    }
}
