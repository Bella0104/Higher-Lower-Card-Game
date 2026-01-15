import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public Deck(boolean includeJokers) {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                if (rank != Rank.JOKER) {
                    cards.add(new Card(suit, rank));
                }
            }
        }

        if (includeJokers) {
            cards.add(new Card(null, Rank.JOKER));
            cards.add(new Card(null, Rank.JOKER));
        }

        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}
