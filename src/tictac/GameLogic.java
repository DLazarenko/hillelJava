package tictac;

public class GameLogic {
    public static final int PLACED_BY_GAMER = 1;
    public static final int PLACED_BY_AI = -1;
    //default
    public AiGameStrategy aiGameStrategy;

    private final int[] field = new int[9];

    public boolean makeTurn(int position) {
        if (field[position] != 0) {
            return false;
        }
        field[position] = PLACED_BY_GAMER;
        return true;
    }

    public int aIMakeTurn() {
        if (field[4] == 0) {
            field[4] = PLACED_BY_AI;
            return 4;
        }
        if (field[4] == 1 && field[0] == 1 && field[8] == 0) {
            field[8] = PLACED_BY_AI;
            return 8;
        } else if (field[4] == 1 && field[2] == 1 && field[6] == 0) {
            field[6] = PLACED_BY_AI;
            return 6;
        } else if (field[4] == 1 && field[6] == 1 && field[2] == 0) {
            field[2] = PLACED_BY_AI;
            return 2;
        } else if (field[4] == 1 && field[8] == 1 && field[0] == 0) {
            field[0] = PLACED_BY_AI;
            return 0;
        } else if (field[1] == 1 && field[2] == 1 && field[0] == 0) {
            field[0] = PLACED_BY_AI;
            return 0;
        } else if (field[0] == 1 && field[1] == 1 && field[2] == 0) {
            field[2] = PLACED_BY_AI;
            return 2;
        } else if (field[0] == 1 && field[3] == 1 && field[6] == 0) {
            field[6] = PLACED_BY_AI;
            return 6;
        } else if (field[2] == 1 && field[5] == 1 && field[8] == 0) {
            field[8] = PLACED_BY_AI;
            return 8;
        } else if (field[6] == 1 && field[7] == 1 && field[8] == 0) {
            field[8] = PLACED_BY_AI;
            return 8;
        } else if (field[7] == 1 && field[8] == 1 && field[6] == 0) {
            field[6] = PLACED_BY_AI;
            return 6;
        } else if (field[4] == 1 && field[1] == 1 && field[7] == 0) {
            field[7] = PLACED_BY_AI;
            return 7;
        } else if (field[4] == 1 && field[7] == 1 && field[1] == 0) {
            field[1] = PLACED_BY_AI;
            return 1;
        } else if (field[3] == 1 && field[6] == 1 && field[0] == 0) {
            field[0] = PLACED_BY_AI;
            return 0;
        } else if (field[4] == 1 && field[5] == 1 && field[3] == 0) {
            field[3] = PLACED_BY_AI;
            return 3;
        } else if (field[3] == 1 && field[4] == 1 && field[5] == 0) {
            field[5] = PLACED_BY_AI;
            return 5;
        } else if (field[0] == 1 && field[2] == 1 && field[1] == 0) {
            field[1] = PLACED_BY_AI;
            return 1;
        } else if (field[2] == 1 && field[8] == 1 && field[5] == 0) {
            field[5] = PLACED_BY_AI;
            return 5;
        } else if (field[0] == 1 && field[6] == 1 && field[3] == 0) {
            field[3] = PLACED_BY_AI;
            return 3;
        } else if (field[6] == 1 && field[8] == 1 && field[7] == 0) {
            field[7] = PLACED_BY_AI;
            return 7;
        } else {
            int aiPosition = aiGameStrategy.aiMakeTurn(field);
            field[aiPosition] = PLACED_BY_AI;
            return aiPosition;
        }
    }


    public void setAiGameStrategy(AiGameStrategy gameStrategy) {
        this.aiGameStrategy = gameStrategy;
    }


    public boolean checkPlayerWin() {
        return checkWin(PLACED_BY_GAMER);
    }

    public boolean checkAiWin() {
        return checkWin(PLACED_BY_AI);
    }

    public boolean checkIsGameEnd() {
        boolean isEnd = true;
        for (int f : field) {
            if (f == 0) {
                isEnd = false;
            }
        }
        return isEnd;
    }

    private boolean checkWin(int placedBy) {
        boolean top = field[0] == placedBy && field[1] == placedBy && field[2] == placedBy;
        boolean middle = field[3] == placedBy && field[4] == placedBy && field[5] == placedBy;
        boolean bottom = field[6] == placedBy && field[7] == placedBy && field[8] == placedBy;

        boolean left = field[0] == placedBy && field[3] == placedBy && field[6] == placedBy;
        boolean center = field[1] == placedBy && field[4] == placedBy && field[7] == placedBy;
        boolean right = field[2] == placedBy && field[5] == placedBy && field[8] == placedBy;

        boolean diagonal = field[0] == placedBy && field[4] == placedBy && field[8] == placedBy;
        boolean backDiagonal = field[2] == placedBy && field[4] == placedBy && field[6] == placedBy;

        boolean isWin = top || middle || bottom || left || center || right || diagonal || backDiagonal;
        return isWin;
    }
}