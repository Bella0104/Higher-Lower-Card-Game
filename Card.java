public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public boolean isJoker() {
        return rank == Rank.JOKER;
    }

    @Override
    public String toString() {
        if (isJoker()) {
            return "JOKER";
        }
        return rank + " of " + suit;
    }
}
