enum Move {

    ROCK, PAPER, SCISSORS;

    // Handle tie in other class
    public boolean beats(Move otherMove) {
        return switch (this) {
            case ROCK -> otherMove == SCISSORS;
            case PAPER -> otherMove == ROCK;
            case SCISSORS -> otherMove == PAPER;
        };
    }
}

enum Result { WIN, LOSE, DRAW }

interface Utils {

    static String returnDrawWinLose(int playerScore, int computerScore){

        boolean equalScore = (playerScore == computerScore);
        boolean winningScore = (playerScore > computerScore);

        return equalScore ? "draw" :
                winningScore ? "playerWin": "computerWin";
    }
}