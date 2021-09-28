enum Move {

    ROCK, PAPER, SCISSORS;

    // Handle tie in other class
    boolean beats(Move otherMove) {
        return switch (this) {
            case ROCK -> otherMove == SCISSORS;
            case PAPER -> otherMove == ROCK;
            case SCISSORS -> otherMove == PAPER;
        };
    }
}

enum Result { WIN, LOSE, DRAW }