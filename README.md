# Higher-Lower-Card-Game
A CLI-based Higher / Lower card game built in Java. The game models a standard 52-card deck with an optional Joker extension.

## Game Rules
- Standard 52-card deck
- Two Jokers included as an extension
- Ace is treated as the highest card
- Joker results in an automatic win for that round
- Correct guess increases the score
- Incorrect guess ends the game
- Deck reshuffles automatically if empty

## Design Rationale
The focus of this solution was to build a clean, readable and extendable
implementation within a limited timeframe. Priority was given to clear
object-oriented structure, separation of concerns, and simplicity over
over-engineering.

## Design Decisions
- Used enums for Suit and Rank to improve readability and type safety
- Separated game logic from the entry point (Main class)
- Implemented a CLI UI to focus on core logic and structure
- Jokers were added as a clean extension without complicating base rules

## Possible Improvements
- GUI version using JavaFX
- Unit tests
- Multiplayer support
- Persistent high score tracking
- Configurable game rules
